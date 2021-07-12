package com.company.synchronization.phaser.example1;

import java.util.concurrent.Phaser;

public class PhaserMain {
    public static void main(String[] args){
        Phaser phaser = new Phaser(1); // parties=1, which corresponds to main thread.
        int currPhase=0;
        new Task(phaser,"task A");
        new Task(phaser,"task B");
        new Task(phaser,"task C");

        currPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Completed phase: "+currPhase);

        currPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Completed phase: "+currPhase);

        currPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Completed phase: "+currPhase);

        phaser.arriveAndDeregister();

        if(phaser.isTerminated()){
            System.out.println("The phaser is terminated.");
        }
    }




}
