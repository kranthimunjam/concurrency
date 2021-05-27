package com.company.semaphore;

import java.util.concurrent.Semaphore;

public class Incrementor implements Runnable {
    Semaphore incrSemaphore;
    Semaphore decrSemaphore;

    public Incrementor(Semaphore s1, Semaphore s2){
        this.incrSemaphore = s1;
        this.decrSemaphore = s2;
    }



    @Override
    public void run() {
        try {
            for(int i=0;i<5;i++){
                incrSemaphore.acquire();
                Counter.counter++;
                System.out.println("Incremented to: "+Counter.counter);
                decrSemaphore.release();
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
