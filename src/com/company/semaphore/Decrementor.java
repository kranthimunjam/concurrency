package com.company.semaphore;

import java.util.concurrent.Semaphore;

public class Decrementor implements Runnable {
    Semaphore incrSemaphore;
    Semaphore decrSemaphore;

    public Decrementor(Semaphore s1, Semaphore s2){
        this.incrSemaphore = s1;
        this.decrSemaphore = s2;
    }


    @Override
    public void run() {
        try {
            for(int i=0;i<5;i++){
                decrSemaphore.acquire();
                Counter.counter--;
                System.out.println("Decremented to: "+Counter.counter);
                incrSemaphore.release();
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
