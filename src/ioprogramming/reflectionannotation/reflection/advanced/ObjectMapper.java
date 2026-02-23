package ioprogramming.reflectionannotation.reflection.advanced;

import java.lang.reflect.Field;
import java.util.Map;

/*
 * Converts Map to object using Reflection.
 */
public class ObjectMapper {

    public static <T> T toObject(
            Class<T> clazz,
            Map<String, Object> properties)
            throws Exception {

        // Create instance dynamically
        T object =
                clazz.getDeclaredConstructor()
                        .newInstance();

        for (Map.Entry<String, Object> entry :
                properties.entrySet()) {

            Field field =
                    clazz.getDeclaredField(entry.getKey());

            field.setAccessible(true);

            field.set(object, entry.getValue());
        }

        return object;
    }
}