package ioprogramming.reflectionannotation.reflection.basic.classinfo;

import java.lang.reflect.*;
import java.util.Scanner;

/*
 * This program accepts a class name as input
 * and displays:
 * - Fields
 * - Methods
 * - Constructors
 * using Reflection API.
 */
public class ClassInfo {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Accept class name from user
        System.out.print("Enter full class name: ");
        String className = scanner.nextLine();

        /*
         * Load class dynamically at runtime.
         * If class is inside a package,
         * provide fully qualified name.
         */
        Class<?> clazz = Class.forName(className);

        System.out.println("\nClass Name: " + clazz.getName());

        // ----------------- Fields -----------------
        System.out.println("\nFields:");
        for (Field field : clazz.getDeclaredFields()) {

            // Print field name and type
            System.out.println(
                    field.getName() + " -> " + field.getType()
            );
        }

        // ----------------- Methods -----------------
        System.out.println("\nMethods:");
        for (Method method : clazz.getDeclaredMethods()) {

            System.out.println(method.getName());
        }

        // ----------------- Constructors -----------------
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor :
                clazz.getDeclaredConstructors()) {

            System.out.println(constructor);
        }
    }
}