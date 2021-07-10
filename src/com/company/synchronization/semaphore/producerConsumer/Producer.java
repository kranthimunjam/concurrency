package com.company.synchronization.semaphore.producerConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    final Queue queue;

    Producer(Queue queue){
        this.queue = queue;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            queue.increment();
        }
    }
}
