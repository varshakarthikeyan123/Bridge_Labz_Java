package ioprogramming.reflectionannotation.reflection.basic.person;

import java.lang.reflect.Field;

/*
 * Demonstrates accessing and modifying
 * a private field using Reflection.
 */
public class PrivateFieldAccess {

    public static void main(String[] args) throws Exception {

        Person person = new Person();

        // Get Class object
        Class<?> clazz = person.getClass();

        // Get private field "age"
        Field field = clazz.getDeclaredField("age");

        /*
         * setAccessible(true) bypasses
         * Java access control checks.
         */
        field.setAccessible(true);

        // Modify private field value
        field.set(person, 25);

        // Retrieve value
        int value = (int) field.get(person);

        System.out.println("Modified age: " + value);
    }
}
