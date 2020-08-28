package org.cmbk.miu.cs525.labs.lab8.bank.proxy;

import org.cmbk.miu.cs525.lectures.lesson8.proxy.StopWatch;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StopWatchProxy implements InvocationHandler {
    private Object target;

    public StopWatchProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        Object returnValue = method.invoke(target, args);
        stopwatch.stop();
        System.out.println("The method " + method.getName() + " took " + stopwatch.getMillis() + " ms");
        return returnValue;
    }
}
