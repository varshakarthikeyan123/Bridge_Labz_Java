package ioprogramming.reflectionannotation.reflection.intermediate.book;

import java.lang.annotation.*;

/*
 * Custom annotation with RUNTIME retention.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Author {

    String name();
}