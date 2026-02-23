package ioprogramming.reflectionannotation.annotation.advanced.role;

import java.lang.annotation.*;

/*
 * Restricts access based on role.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RoleAllowed {

    String value(); // Required role
}
