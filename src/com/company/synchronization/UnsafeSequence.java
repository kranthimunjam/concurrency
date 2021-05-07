package com.company.synchronization;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class UnsafeSequence implements Runnable{
    private int value=0;

    /* Returns the value. */
    public int getNext(){
        return value;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            value ++;
            System.out.println(Thread.currentThread().getName()+": "+value);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread sleep() Interrupted");
            }
        }

    }
}
