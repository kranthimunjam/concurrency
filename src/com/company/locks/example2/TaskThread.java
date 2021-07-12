package com.company.locks.example2;

import java.util.concurrent.locks.ReentrantLock;

public class TaskThread implements Runnable{
    final String name;
    final ReentrantLock lock;

    TaskThread(ReentrantLock lock, String name){
        this.lock = lock;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name+" is trying to acquire lock");
        lock.lock();
        System.out.println(name+" acquired the lock");
        Shared.count++;
        System.out.println(name+" incremented counter. counter: "+Shared.count);
        System.out.println(name+" releasing the lock");
        lock.unlock();
    }
}
