package com.company.atomicOperations;

public class TaskThread implements Runnable{
    final String name;

    public TaskThread(String name) {
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            /*
             final value of counter is always going to be 10 as each thread increments count value exactly 5 times.
             print statement here may not be accurate due to race condition while printing.
            */
            System.out.println("Counter incremented by"+name+" counter:"+ Shared.counter.incrementAndGet());
        }
    }
}
