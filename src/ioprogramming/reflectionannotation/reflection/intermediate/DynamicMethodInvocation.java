package ioprogramming.reflectionannotation.reflection.intermediate;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * Calls method dynamically based on user input.
 */
public class DynamicMethodInvocation {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter method name: ");
        String methodName = scanner.nextLine();

        MathOperations obj = new MathOperations();

        Class<?> clazz = obj.getClass();

        // Get method dynamically
        Method method =
                clazz.getMethod(methodName,
                        int.class, int.class);

        Object result =
                method.invoke(obj, 10, 5);

        System.out.println("Result: " + result);
    }
}
