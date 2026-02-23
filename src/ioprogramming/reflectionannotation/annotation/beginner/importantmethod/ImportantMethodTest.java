package ioprogramming.reflectionannotation.annotation.beginner.importantmethod;

import java.lang.reflect.Method;

/*
 * Reads annotation at runtime using Reflection.
 */
public class ImportantMethodTest {

    public static void main(String[] args) {

        // Get all declared methods
        Method[] methods =
                Service.class.getDeclaredMethods();

        for (Method method : methods) {

            // Check if annotation is present
            if (method.isAnnotationPresent(
                    ImportantMethod.class)) {

                // Retrieve annotation instance
                ImportantMethod annotation =
                        method.getAnnotation(
                                ImportantMethod.class);

                System.out.println(
                        method.getName()
                                + " -> Level: "
                                + annotation.level()
                );
            }
        }
    }
}