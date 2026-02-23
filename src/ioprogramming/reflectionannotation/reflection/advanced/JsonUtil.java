package ioprogramming.reflectionannotation.reflection.advanced;

import java.lang.reflect.Field;

/*
 * Converts object into JSON-like string.
 */
public class JsonUtil {

    public static String toJson(Object obj)
            throws Exception {

        StringBuilder builder = new StringBuilder();
        builder.append("{");

        Field[] fields =
                obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {

            fields[i].setAccessible(true);

            builder.append("\"")
                    .append(fields[i].getName())
                    .append("\":\"")
                    .append(fields[i].get(obj))
                    .append("\"");

            if (i < fields.length - 1)
                builder.append(",");
        }

        builder.append("}");

        return builder.toString();
    }
}
