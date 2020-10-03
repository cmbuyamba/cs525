package org.cmbk.miu.cs525.lectures.lesson11.framework;

import org.cmbk.miu.cs525.lectures.lesson11.annotation.Inject;

import java.lang.reflect.Field;
import java.util.Arrays;

public class FWApplication {
    public static void run(Class applicationClass) {
        // create the context
        FWContext fWContext = new FWContext();
        try {
            // create instance of the application class
            Object applicationObject = (Object) applicationClass.newInstance();
            Field field = Arrays.stream(applicationObject.getClass().getDeclaredFields())
                    .filter(f -> f.isAnnotationPresent(Inject.class))
                    .findAny().get();
            Object instance = fWContext.getBeanOfType(field.getType());
            //do injection
            field.setAccessible(true);
            field.set(applicationObject, instance);
            //call run method
            if (applicationObject instanceof Runnable) {
                ((Runnable) applicationObject).run();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
