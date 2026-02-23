package ioprogramming.reflectionannotation.reflection.basic.student;

/*
 * Creates object without using new keyword.
 */
public class DynamicObjectCreation {

    public static void main(String[] args) throws Exception {

        // Load class dynamically
        Class<?> clazz = Class.forName("Student");

        /*
         * getDeclaredConstructor().newInstance()
         * creates object dynamically.
         */
        Object object =
                clazz.getDeclaredConstructor()
                        .newInstance();

        System.out.println(
                "Created: " + object.getClass().getName()
        );
    }
}