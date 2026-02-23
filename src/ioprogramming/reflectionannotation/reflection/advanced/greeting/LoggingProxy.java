package ioprogramming.reflectionannotation.reflection.advanced.greeting;

import java.lang.reflect.*;

/*
 * Intercepts method calls dynamically.
 */
public class LoggingProxy implements InvocationHandler {

    private Object target;

    public LoggingProxy(Object target) {

        this.target = target;
    }

    public Object invoke(
            Object proxy,
            Method method,
            Object[] args)
            throws Throwable {

        System.out.println(
                "Calling method: " + method.getName()
        );

        return method.invoke(target, args);
    }
}