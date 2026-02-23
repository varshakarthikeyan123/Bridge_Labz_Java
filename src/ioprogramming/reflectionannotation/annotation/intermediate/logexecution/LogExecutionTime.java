package ioprogramming.reflectionannotation.annotation.intermediate.logexecution;

import java.lang.annotation.*;

/*
 * Marker annotation for measuring execution time.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}