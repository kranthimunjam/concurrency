package com.company.interThreadCommunication;

public class Queue {
    int n;
    public int get(){
        System.out.println("getting:"+ n);
        return n;
    }

    public void put(int val) {
        this.n = val;
    }
}
