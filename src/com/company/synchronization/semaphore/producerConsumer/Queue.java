package com.company.synchronization.semaphore.producerConsumer;

import java.util.concurrent.Semaphore;

public class Queue {
    public int count=0;
    Semaphore conSemaphore = new Semaphore(0);
    Semaphore prodSemaphore = new Semaphore(1);

    public void increment(){
        try{
            prodSemaphore.acquire();
            count++;
            System.out.println("value after incrementing is:"+count);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // after producing notify the consumer.
        conSemaphore.release();
    }

    public void decrement(){
        try {
            conSemaphore.acquire();
            count--;
            System.out.println("value after decrementing is:"+count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // after consuming notify the producer.
        prodSemaphore.release();
    }
}
