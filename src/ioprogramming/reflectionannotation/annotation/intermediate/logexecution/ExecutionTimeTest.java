package ioprogramming.reflectionannotation.annotation.intermediate.logexecution;

import java.lang.reflect.Method;

/*
 * Measures execution time dynamically.
 */
public class ExecutionTimeTest {

    public static void main(String[] args)
            throws Exception {

        TimeService service =
                new TimeService();

        for (Method method :
                TimeService.class.getDeclaredMethods()) {

            if (method.isAnnotationPresent(
                    LogExecutionTime.class)) {

                long start = System.nanoTime();

                // Invoke annotated method
                method.invoke(service);

                long end = System.nanoTime();

                System.out.println(
                        method.getName()
                                + " took "
                                + (end - start)
                                + " nanoseconds");
            }
        }
    }
}
