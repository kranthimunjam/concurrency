package com.company.locking;

public class ProducerConsumerClient {
    public static void main(String args[]) {
        SynchronizedQueue q = new SynchronizedQueue();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}
