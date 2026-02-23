package ioprogramming.reflectionannotation.reflection.intermediate.configuration;

import java.lang.reflect.Field;

/*
 * Modify private static field using Reflection.
 */
public class ModifyStaticField {

    public static void main(String[] args)
            throws Exception {

        Field field =
                Configuration.class
                        .getDeclaredField("API_KEY");

        field.setAccessible(true);

        // For static field, pass null object
        field.set(null, "NEW_KEY");

        System.out.println(
                "Updated API_KEY: " + field.get(null)
        );
    }
}