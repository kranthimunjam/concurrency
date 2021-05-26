package com.company.priorities;

public class Clicker implements Runnable {
    long click =0;
    public volatile boolean running = true;
    Thread thread;
    public Clicker(int p){
        // passing 'this' while thread creation is a mistake I made.
        this.thread = new Thread(this);
        this.thread.setPriority(p);
    }

    public void start(){
        this.thread.start();
    }

    public void stop(){
        running = false;
    }

    @Override
    public void run() {
        while(running){
            click++;
        }
    }
}
