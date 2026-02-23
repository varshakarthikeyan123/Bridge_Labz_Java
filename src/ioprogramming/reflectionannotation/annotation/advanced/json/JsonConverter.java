package ioprogramming.reflectionannotation.annotation.advanced.json;

import java.lang.reflect.Field;

/*
 * Converts object into JSON-like string
 * using annotation metadata.
 */
public class JsonConverter {

    public static String toJson(Object obj)
            throws Exception {

        StringBuilder builder =
                new StringBuilder("{");

        Field[] fields =
                obj.getClass()
                        .getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {

            fields[i].setAccessible(true);

            JsonField annotation =
                    fields[i].getAnnotation(
                            JsonField.class);

            if (annotation != null) {

                builder.append("\"")
                        .append(annotation.name())
                        .append("\":\"")
                        .append(fields[i].get(obj))
                        .append("\"");
            }

            if (i < fields.length - 1)
                builder.append(",");
        }

        builder.append("}");

        return builder.toString();
    }
}