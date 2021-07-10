package com.company.synchronization.synchronizedBlock;

public class SynchronizationMain {
    public static void main(String[] args)  {
        System.out.println("Main thread started");

        System.out.println("safe sequence generation");
        SafeSequence safeSequence = new SafeSequence();
        Thread thread1 = new Thread(safeSequence);
        thread1.setName("thread1");
        Thread thread2 = new Thread(safeSequence);
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println("Interrupted Exception");
        }

        System.out.println("unsafe sequence generation");
        UnsafeSequence unsafeSequencee = new UnsafeSequence();
        thread1 = new Thread(unsafeSequencee);
        thread1.setName("thread1");
        thread2 = new Thread(unsafeSequencee);
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
