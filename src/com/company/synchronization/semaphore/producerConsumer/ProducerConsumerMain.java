package com.company.synchronization.semaphore.producerConsumer;


public class ProducerConsumerMain {
    public static void main(String[] args){
        Queue queue = new Queue();
        new Producer(queue);
        new Consumer(queue);
    }
}
