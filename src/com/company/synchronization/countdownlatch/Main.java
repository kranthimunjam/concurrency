package com.company.synchronization.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args){
        CountDownLatch countDownLatch = new CountDownLatch(5);
        new MyThread(countDownLatch);

        try {
            countDownLatch.await(); // This means, main thread will wait until latchCount is decremented in MyThread 5 times.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Resuming the execution of "+ Thread.currentThread().getName());
    }
}
