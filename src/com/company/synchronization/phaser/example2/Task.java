package com.company.synchronization.phaser.example2;

public class Task implements Runnable{
    final MyPhaser phaser;
    final String name;

    public Task(MyPhaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register(); // It is very important to register.
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(!phaser.isTerminated()){
            System.out.println(name+" beginning phase"+phaser.getPhase()+".");
            phaser.arriveAndAwaitAdvance();

            // following code is added only to make the output look clean.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        /*
        No need to deregister in this case because the phaser will be terminated once all phases are complete,
        thanks to our overriden onAdvance() method.
         */
        // phaser.arriveAndDeregister();

    }
}
