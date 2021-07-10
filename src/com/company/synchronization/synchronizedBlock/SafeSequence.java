package com.company.synchronization.synchronizedBlock;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class SafeSequence implements Runnable {
    private int value=0;

    /* Returns the value. */
    public int getValue(){
        return value;
    }

    @Override
    public void run() {
        System.out.println("Starting "+Thread.currentThread().getName()+"...");
        for(int i =0;i<5;i++){
            // synchronized read/writes to shared mutable "value".
            synchronized (this){
                value++;
                System.out.println(Thread.currentThread().getName()+": "+value);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread sleep() Interrupted");
            }
        }

    }

}
