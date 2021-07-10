package com.company.synchronization.semaphore.example;

import com.company.synchronization.semaphore.example.Shared;

import java.util.concurrent.Semaphore;

public class IncrementorThread implements Runnable{
    final Semaphore semaphore;
    final String name;

    IncrementorThread(Semaphore semaphore, String name){
        this.semaphore = semaphore;
        this.name = name;
        Thread current  = new Thread(this, name);
        current.setPriority(Thread.NORM_PRIORITY);
        current.start();
    }

    @Override
    public void run() {
        System.out.println("Starting "+ name);
        try{
            System.out.println("Thread "+name+" trying to acquire permit...");
            semaphore.acquire();
            System.out.println("Thread "+name+" got the permit.");
            // this is to ensure that other thread starts by now and tries to acquire semaphore.
            for(int i=0;i<5;i++){
                Shared.count++;
                System.out.println("Incremented. Counter value is "+ Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Thread "+name+" releasing permit...");
        semaphore.release();
    }
}
