package ioprogramming.reflectionannotation.annotation.intermediate.maxlength;

import java.lang.annotation.*;

/*
 * Field-level validation annotation.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MaxLength {

    // Maximum allowed string length
    int value();
}