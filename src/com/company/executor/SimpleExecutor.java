package com.company.executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutor {

    public static void main(String args[]){
        long start = System.currentTimeMillis();
        //Create an executor with thread pool size 2 (meaning two threads will be available in the pool)
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);

        System.out.println("Starting the thread execution using Executor...");

        //All the tasks will be executed using the two threads in executor threadPool.
        executorService.execute(new TaskThread(cd1,"A"));
        executorService.execute(new TaskThread(cd2,"B"));
        executorService.execute(new TaskThread(cd3,"C"));
        executorService.execute(new TaskThread(cd4,"D"));

        try{
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await(); // main waits until all latch counts reach 0, and then resumes execution.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // shutdown the executor.
        executorService.shutdown();
        long end  = System.currentTimeMillis();
        // finish time varies depending on the number of threads in the thread pool.
        System.out.println("Finished in : "+ (end-start)+" milliseconds");

    }
}
