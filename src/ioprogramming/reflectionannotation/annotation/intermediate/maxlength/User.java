package ioprogramming.reflectionannotation.annotation.intermediate.maxlength;

import java.lang.reflect.Field;

/*
 * Validates field using annotation.
 */
public class User {

    @MaxLength(10)
    private String username;

    public User(String username)
            throws Exception {

        // Get field metadata
        Field field =
                User.class.getDeclaredField(
                        "username");

        // Retrieve annotation
        MaxLength annotation =
                field.getAnnotation(MaxLength.class);

        // Validate input length
        if (username.length() >
                annotation.value()) {

            throw new IllegalArgumentException(
                    "Username exceeds limit of "
                            + annotation.value());
        }

        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}