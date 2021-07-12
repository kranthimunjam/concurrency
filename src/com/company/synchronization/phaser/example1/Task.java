package com.company.synchronization.phaser.example1;

import java.util.concurrent.Phaser;

public class Task implements Runnable{
    final Phaser phaser;
    final String name;

    public Task(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register(); // It is very important to register.
        new Thread(this).start();
    }

    @Override
    public void run() {

        phaser.arriveAndAwaitAdvance();
        System.out.println(name+" completed phase"+phaser.getPhase()+".");

        phaser.arriveAndAwaitAdvance();
        System.out.println(name+" completed phase"+phaser.getPhase()+".");

        phaser.arriveAndAwaitAdvance();
        System.out.println(name+" completed phase"+phaser.getPhase()+".");

        phaser.arriveAndDeregister();

    }
}
