package com.company.synchronization.semaphore;

import com.company.semaphore.Decrementor;

import java.util.concurrent.Semaphore;

public class DecrementorThread implements Runnable{
    final Semaphore semaphore;
    final String name;

    DecrementorThread(Semaphore semaphore, String name){
        this.semaphore = semaphore;
        this.name = name;
        Thread current  = new Thread(this, name);
        current.setPriority(Thread.MIN_PRIORITY);
        current.start();
    }

    @Override
    public void run() {
        System.out.println("Starting "+ name);
        try{
            System.out.println("Thread "+name+" trying to acquire permit...");
            semaphore.acquire();
            // this is to ensure that other thread starts by now and tries to acquire semaphore.
            Thread.sleep(1000);
            System.out.println("Thread "+name+" got the permit.");
            for(int i=0;i<5;i++){
                Shared.count--;
                System.out.println("Decremented. Counter value is "+ Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Thread "+name+" releasing permit...");
        semaphore.release();

    }
}
