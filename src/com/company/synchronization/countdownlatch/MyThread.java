package com.company.synchronization.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
    CountDownLatch countDownLatch;

    MyThread(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
        new Thread(this).start();
    }


    @Override
    public void run() {
        for(int i=0;i<8;i++){
            try {
                System.out.println("*** "+i+" ***");
                /*
                 main will wait till 5 iterations, after that two threads can run in any order.
                 Using latch for a single thread can be confusing.
                 This logic can be used in circuit breakers where each time thread times out, latch count is reduced.
                 Once the latch count is 0 then circuit is open and fall back logic is executed.
                 But more appropriate mechanism for this use case is CyclicBarrier.
                 */
                countDownLatch.countDown();
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
