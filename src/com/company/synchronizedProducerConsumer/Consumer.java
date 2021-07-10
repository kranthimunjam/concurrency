package com.company.synchronizedProducerConsumer;

class Consumer implements Runnable {
    SynchronizedQueue q;
    Consumer(SynchronizedQueue q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while(true) {
            q.get();
        }
    }
}