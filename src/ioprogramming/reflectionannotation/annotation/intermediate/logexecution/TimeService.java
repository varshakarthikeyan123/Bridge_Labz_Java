package ioprogramming.reflectionannotation.annotation.intermediate.logexecution;

/*
 * Class with methods to measure performance.
 */
public class TimeService {

    @LogExecutionTime
    public void slowTask() throws Exception {

        Thread.sleep(300); // simulate delay
    }

    @LogExecutionTime
    public void fastTask() throws Exception {

        Thread.sleep(100);
    }
}
