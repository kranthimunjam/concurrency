package com.company.synchronization.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable{
    final CyclicBarrier cyclicBarrier;
    final String threadName;

    Task(CyclicBarrier cyclicBarrier, String name){
        this.cyclicBarrier = cyclicBarrier;
        this.threadName = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            System.out.println(threadName+ " is running...");
            cyclicBarrier.await(); // thread will wait here until the barrier is reached.
            // once the barrier is reached, execution continues.
            System.out.println(threadName+ " waiting on barrier finished...");
        } catch (BrokenBarrierException | InterruptedException e)  {
            e.printStackTrace();
        }
    }
}
