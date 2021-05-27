package com.company.threadSuspendResumeStop;

public class ThreadControlMain {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread("My thread");
        Thread.sleep(1000);

        thread1.suspendThread();
        Thread.sleep(1000);
        thread1.resumeThread();
        thread1.t.join();
        System.out.println("Exiting main...");
    }
}
