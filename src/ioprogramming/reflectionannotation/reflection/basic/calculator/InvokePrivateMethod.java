package ioprogramming.reflectionannotation.reflection.basic.calculator;

import java.lang.reflect.Method;

/*
 * Invokes private method using Reflection.
 */
public class InvokePrivateMethod {

    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();

        Class<?> clazz = calculator.getClass();

        // Get private method
        Method method =
                clazz.getDeclaredMethod(
                        "multiply", int.class, int.class
                );

        // Allow access
        method.setAccessible(true);

        // Invoke method dynamically
        Object result =
                method.invoke(calculator, 5, 6);

        System.out.println("Result: " + result);
    }
} 
