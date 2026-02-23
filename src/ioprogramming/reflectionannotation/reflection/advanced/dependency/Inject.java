package ioprogramming.reflectionannotation.reflection.advanced.dependency;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Inject {
}