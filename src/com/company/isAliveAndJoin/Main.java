package com.company.isAliveAndJoin;

public class Main {
    public static void main(String[] args)  {
        Thread thread = new Thread(new TestThread());
        thread.start();

        // This is an indirect way (effectively what join() does) to wait on a thread; May be not efficient.
        while(thread.isAlive());
        System.out.println("Main thread exiting ...");

    }
}
