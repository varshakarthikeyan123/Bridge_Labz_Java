package ioprogramming.reflectionannotation.annotation.beginner.importantmethod;

/*
 * Sample class where annotation is applied.
 */
public class Service {

    // Uses default level = HIGH
    @ImportantMethod
    public void process() {
        System.out.println("Processing task...");
    }

    // Overrides default level
    @ImportantMethod(level = "LOW")
    public void helper() {
        System.out.println("Helping...");
    }

    // Normal method (no annotation)
    public void normal() {
        System.out.println("Normal method");
    }
}