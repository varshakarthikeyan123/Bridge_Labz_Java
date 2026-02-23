package ioprogramming.reflectionannotation.annotation.advanced.cache;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/*
 * Implements simple caching logic.
 */
public class CacheExecutor {

    private static Map<Integer, Object>
            cache = new HashMap<>();

    public static Object invoke(
            Object obj,
            String methodName,
            int input)
            throws Exception {

        Method method =
                obj.getClass()
                        .getMethod(methodName,
                                int.class);

        if (method.isAnnotationPresent(
                CacheResult.class)) {

            if (cache.containsKey(input)) {

                System.out.println(
                        "Returning from cache");
                return cache.get(input);
            }

            Object result =
                    method.invoke(obj, input);

            cache.put(input, result);

            return result;
        }

        return method.invoke(obj, input);
    }
}
