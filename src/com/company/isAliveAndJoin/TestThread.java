package com.company.isAliveAndJoin;

public class TestThread implements Runnable {

    @Override
    public void run() {
        System.out.println("This is child thread");
    }
}
