package com.company.interThreadCommunication;

public class Producer implements Runnable {
    Queue q;

    Producer(Queue q){
        this.q = q;
    }


    @Override
    public void run() {
        int n=0;
        while(true){
            q.put(n);
            n++;
        }
    }
}
