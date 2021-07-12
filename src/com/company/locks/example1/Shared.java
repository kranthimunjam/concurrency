package com.company.locks.example1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shared {
    static Lock lock = new ReentrantLock();
    private static int count =0;

    public static int increment(){
        lock.lock();
        count++;
        System.out.println("Incremented to value: "+count);
        lock.unlock();
        return count;
    }
}
