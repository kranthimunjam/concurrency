package com.company.synchronization.semaphore.example;

import java.util.concurrent.Semaphore;

public class MainClass {
    public static void main(String args[]) {
        Semaphore semaphore = new Semaphore(1);
        System.out.println("Initial value of the counter is: "+ Shared.count);
        /*
        Here compiler can optimize and below two instructions can be executed in any order.
        To ensure that they are executed in that order we can either
        1. set priorities or
        2. use join(). (in our case we are not extending thread so join() is not possible).
         */
        new IncrementorThread(semaphore, "incrementor");// To ensure order, this thread is given NORM_PRIORITY
        new DecrementorThread(semaphore, "decrementor"); // this thread is given MIN_PRIORITY
    }
}
