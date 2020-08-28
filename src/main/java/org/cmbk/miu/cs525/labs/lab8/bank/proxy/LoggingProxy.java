package org.cmbk.miu.cs525.labs.lab8.bank.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingProxy implements InvocationHandler {
    private Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Invoke the method on the target
        Object invoke = method.invoke(target, args);
        Logger.log("Calling method: " + method.getName() + " with argument(s):");
        if (args != null)
            for (int i = 0; i < args.length; i++) {
                Logger.log(" Param[" + i + "]: " + args[i].toString());
            }
        return invoke;
    }
}
