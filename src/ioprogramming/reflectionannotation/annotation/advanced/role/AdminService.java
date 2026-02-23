package ioprogramming.reflectionannotation.annotation.advanced.role;

/*
 * Only ADMIN role can execute this method.
 */
public class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {

        System.out.println("User deleted.");
    }
}