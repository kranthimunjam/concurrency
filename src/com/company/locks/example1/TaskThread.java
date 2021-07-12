package com.company.locks.example1;

import com.company.locks.example1.Shared;

public class TaskThread implements Runnable{
    final String name;
    TaskThread(String name){
        this.name = name;
        new Thread(this).start();
    }


    @Override
    public void run() {
        for (int i=0;i<5;i++){
            Shared.increment();
        }
    }
}
