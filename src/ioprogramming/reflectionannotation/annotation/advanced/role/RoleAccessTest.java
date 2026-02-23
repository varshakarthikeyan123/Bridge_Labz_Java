package ioprogramming.reflectionannotation.annotation.advanced.role;

import java.lang.reflect.Method;

/*
 * Simulates role-based access control.
 */
public class RoleAccessTest {

    public static void main(String[] args)
            throws Exception {

        String currentRole = "USER"; // simulate login

        AdminService service =
                new AdminService();

        for (Method method :
                AdminService.class.getDeclaredMethods()) {

            if (method.isAnnotationPresent(
                    RoleAllowed.class)) {

                RoleAllowed role =
                        method.getAnnotation(
                                RoleAllowed.class);

                if (role.value()
                        .equals(currentRole)) {

                    method.invoke(service);
                } else {

                    System.out.println(
                            "Access Denied!");
                }
            }
        }
    }
}
