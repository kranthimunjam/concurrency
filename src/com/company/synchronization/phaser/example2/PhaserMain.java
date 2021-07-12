package com.company.synchronization.phaser.example2;

public class PhaserMain {
    public static void main(String[] args){
        MyPhaser myPhaser = new MyPhaser(1,3);
        int currentPhase =0;

        new Task(myPhaser,"task A");
        new Task(myPhaser,"task B");
        new Task(myPhaser,"task C");

        while(!myPhaser.isTerminated()){
            currentPhase = myPhaser.getPhase();
            myPhaser.arriveAndAwaitAdvance();
            System.out.println("Phase "+ currentPhase+" is completed.");
        }
        System.out.println("Phaser is terminated.");
    }
}
