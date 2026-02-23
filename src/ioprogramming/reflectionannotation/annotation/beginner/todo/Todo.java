package ioprogramming.reflectionannotation.annotation.beginner.todo;

import java.lang.annotation.*;

/*
 * Used to mark pending development tasks.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Todo {

    // Task description
    String task();

    // Developer responsible
    String assignedTo();

    // Optional priority
    String priority() default "MEDIUM";
}