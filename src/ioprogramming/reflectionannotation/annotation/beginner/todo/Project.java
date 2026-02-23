package ioprogramming.reflectionannotation.annotation.beginner.todo;

/*
 * Class with methods marked using @Todo.
 */
public class Project {

    @Todo(task = "Implement Login",
            assignedTo = "Varsha")
    public void login() {
    }

    @Todo(task = "Create Dashboard",
            assignedTo = "Arun",
            priority = "HIGH")
    public void dashboard() {
    }
}