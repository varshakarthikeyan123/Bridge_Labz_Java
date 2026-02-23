package ioprogramming.reflectionannotation.annotation.advanced.json;

import java.lang.annotation.*;

/*
 * Custom JSON key mapping.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField {

    String name();
}
