package com.company.priorities;

public class PriorityMain {
    public static void main(String[] args)  {
        Clicker lowPriorityClicker = new Clicker(Thread.NORM_PRIORITY-2);
        Clicker highPriorityClicker = new Clicker(Thread.NORM_PRIORITY+2);

        lowPriorityClicker.start();
        highPriorityClicker.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        lowPriorityClicker.stop();
        highPriorityClicker.stop();

        try {
            lowPriorityClicker.thread.join();
            highPriorityClicker.thread.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Low-priority thread: " + lowPriorityClicker.click);
        System.out.println("High-priority thread: " + highPriorityClicker.click);
    }
}
