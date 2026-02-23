package ioprogramming.reflectionannotation.annotation.advanced.cache;

import java.lang.annotation.*;

/*
 * Marks method for caching.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CacheResult {
}