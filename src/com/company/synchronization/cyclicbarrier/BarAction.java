package com.company.synchronization.cyclicbarrier;

public class BarAction implements Runnable{

    // this is executed when the barrier is reached.
    @Override
    public void run() {
        System.out.println("Barrier has reached, performing bar action.");
    }
}
