package ioprogramming.reflectionannotation.reflection.advanced.dependency;

import java.lang.reflect.Field;

/*
 * Simple DI container implementation.
 */
public class DIContainer {

    public static <T> T create(Class<T> clazz)
            throws Exception {

        T object =
                clazz.getDeclaredConstructor()
                        .newInstance();

        for (Field field :
                clazz.getDeclaredFields()) {

            if (field.isAnnotationPresent(Inject.class)) {

                Object dependency =
                        field.getType()
                                .getDeclaredConstructor()
                                .newInstance();

                field.setAccessible(true);

                field.set(object, dependency);
            }
        }

        return object;
    }
}
