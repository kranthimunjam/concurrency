package com.company.synchronizedProducerConsumer;

class Producer implements Runnable {
    SynchronizedQueue q;
    Producer(SynchronizedQueue q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }
}