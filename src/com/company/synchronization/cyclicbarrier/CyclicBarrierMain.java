package com.company.synchronization.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {
    public static void main(String[] args){
        //following CyclicBarrier waits for three threads and when that happens, executes BarAction.
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarAction());

        new Task(cyclicBarrier, "task1");
        new Task(cyclicBarrier, "task2");
        new Task(cyclicBarrier, "task3");
        /*
        barrier can be reused because it will release waiting threads
        each time the specified number of threads calls await( ).
        But reuse only if you want to perform same action when the barrier is reached.
         */
        new Task(cyclicBarrier, "task4");
        new Task(cyclicBarrier, "task5");
        new Task(cyclicBarrier, "task6");
        //new Task(cyclicBarrier, "task4"); in this case main thread exits but thread 4 continue to wait for the
    }
}
