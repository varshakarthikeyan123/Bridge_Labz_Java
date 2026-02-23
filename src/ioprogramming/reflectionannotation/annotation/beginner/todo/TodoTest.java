package ioprogramming.reflectionannotation.annotation.beginner.todo;

import java.lang.reflect.Method;

/*
 * Displays all pending tasks at runtime.
 */
public class TodoTest {

    public static void main(String[] args) {

        for (Method method :
                Project.class.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo =
                        method.getAnnotation(Todo.class);

                System.out.println(
                        "Method: " + method.getName());
                System.out.println(
                        "Task: " + todo.task());
                System.out.println(
                        "Assigned To: "
                                + todo.assignedTo());
                System.out.println(
                        "Priority: "
                                + todo.priority());
                System.out.println("------------------");
            }
        }
    }
}
