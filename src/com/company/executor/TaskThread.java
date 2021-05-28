package com.company.executor;

import java.util.concurrent.CountDownLatch;

public class TaskThread implements Runnable{
    String name;
    CountDownLatch latch;

    public TaskThread(CountDownLatch latch, String name){
        this.name = name;
        this.latch = latch;

        new Thread(this);
    }


    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(name+": "+ i);
            latch.countDown();
        }
    }
}
