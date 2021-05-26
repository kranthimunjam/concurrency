package com.company.threadCreation;

public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("This is a thread created by implementing the Runnable class");
    }
}
