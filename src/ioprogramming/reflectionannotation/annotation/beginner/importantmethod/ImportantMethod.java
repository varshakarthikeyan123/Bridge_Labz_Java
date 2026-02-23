package ioprogramming.reflectionannotation.annotation.beginner.importantmethod;

import java.lang.annotation.*;

/*
 * @Retention defines how long annotation is retained.
 * RUNTIME means it is available during execution
 * and can be accessed using Reflection.
 */
@Retention(RetentionPolicy.RUNTIME)

/*
 * @Target defines where this annotation can be used.
 * METHOD means it can be applied only on methods.
 */
@Target(ElementType.METHOD)
public @interface ImportantMethod {

    // Optional parameter with default value
    String level() default "HIGH";
}
