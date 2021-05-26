package com.company.threadCreation;

public class CreationMain {
        public static void main(String[] args) throws InterruptedException {
            // this creates a thread using the class that implements runnable interface.
            Thread runnableThread = new Thread(new RunnableImpl());
            runnableThread.start();

            // this creates a thread using the class that extends thread class.
            Thread extendedThread = new ExtendedImpl();
            extendedThread.start();

            // This ensures that the main thread will wait for the runnableThread to finish;
            runnableThread.join();
            System.out.println("Main exiting...");
        }
}
