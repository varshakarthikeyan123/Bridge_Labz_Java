package ioprogramming.reflectionannotation.reflection.advanced.method;

import java.lang.reflect.Method;

/*
 * Measures execution time of methods dynamically.
 */
public class MethodTimer {

    public static void main(String[] args)
            throws Exception {

        SampleTask task = new SampleTask();

        for (Method method :
                SampleTask.class.getDeclaredMethods()) {

            long start = System.nanoTime();

            method.invoke(task);

            long end = System.nanoTime();

            System.out.println(
                    method.getName()
                            + " took "
                            + (end - start)
                            + " nanoseconds"
            );
        }
    }
}
