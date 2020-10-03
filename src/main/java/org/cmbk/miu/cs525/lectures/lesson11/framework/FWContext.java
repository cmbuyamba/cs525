package org.cmbk.miu.cs525.lectures.lesson11.framework;

import org.cmbk.miu.cs525.lectures.lesson11.annotation.Inject;
import org.cmbk.miu.cs525.lectures.lesson11.annotation.Service;
import org.cmbk.miu.cs525.lectures.lesson11.annotation.Test;
import org.cmbk.miu.cs525.lectures.lesson11.annotation.TestClass;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class FWContext {
    private List<Object> objectList = new ArrayList<>();

    public FWContext() {
        //find and instantiate all classes annotated with the @TestClass annotation
        Reflections reflections = new Reflections("");
        Set<Class<?>> types = reflections.getTypesAnnotatedWith(Service.class);
        types.addAll(reflections.getTypesAnnotatedWith(TestClass.class));
        types.forEach(type -> {
            try {
                objectList.add(type.newInstance());
            } catch (InstantiationException | IllegalAccessException ex) {
                ex.printStackTrace();
            }
        });
        performDI();
    }

    public void performDI() {

        objectList.forEach(object -> {
            //find and invoke all methods annotated with the @Test annotation
            Arrays.stream(object.getClass().getDeclaredMethods())
                    .filter(method -> method.isAnnotationPresent(Test.class))
                    .forEach(method -> {
                        try {
                            method.invoke(object);
                        } catch (IllegalAccessException | InvocationTargetException ex) {
                            ex.printStackTrace();
                        }
                    });
        });

        ResourceBundle config = ResourceBundle.getBundle("config");

        objectList.forEach(object -> {
            Arrays.stream(object.getClass().getDeclaredFields()).filter(field -> field.isAnnotationPresent(Inject.class))
                    .forEach(field -> {
                        //get the type of the field
                        Class<?> fieldType = field.getType();
                        //get the object instance of the type
                        Object instance;
                        if (fieldType.getName().contentEquals("java.lang.String")) {
                            instance = config.getString(field.getAnnotation(Inject.class).value());
                        } else
                            instance = getBeanOfType(fieldType);
                        field.setAccessible(true);
                        try {
                            field.set(object, instance);
                        } catch (IllegalAccessException ex) {
                            ex.printStackTrace();
                        }
                    });
        });
    }

    public Object getBeanOfType(Class interfaceClass) {
        //List<Object> objectList = new ArrayList<Object>();



        return objectList.stream().filter(object ->
                Arrays.stream(object.getClass().getInterfaces())
                        .anyMatch(aClass -> aClass.getName().equals(interfaceClass.getName()))
        ).findFirst().get();
    }
}
