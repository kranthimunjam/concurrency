package com.company.synchronization;

public class SynchronizationMain {
    public static void main(String[] args)  {
        System.out.println("Main thread started");
        SafeSequence sequence = new SafeSequence();
        Thread thread1 = new Thread(sequence);
        thread1.setName("thread1");
        Thread thread2 = new Thread(sequence);
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println("Interrupted Exception");
        }

        System.out.println("Main thread ended");
    }
}
