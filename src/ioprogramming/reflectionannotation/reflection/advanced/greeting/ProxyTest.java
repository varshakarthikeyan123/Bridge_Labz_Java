package ioprogramming.reflectionannotation.reflection.advanced.greeting;

import java.lang.reflect.Proxy;

/*
 * Creates dynamic proxy instance.
 */
public class ProxyTest {

    public static void main(String[] args) {

        Greeting greeting =
                new GreetingImpl();

        Greeting proxy =
                (Greeting) Proxy.newProxyInstance(
                        Greeting.class.getClassLoader(),
                        new Class[]{Greeting.class},
                        new LoggingProxy(greeting)
                );

        proxy.sayHello();
    }
}