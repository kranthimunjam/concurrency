package com.company.semaphore;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Semaphore incrSemaphore = new Semaphore(1);
        Semaphore decrSemaphore = new Semaphore(0);
        Thread incrementor = new Thread(new Incrementor(incrSemaphore,decrSemaphore));

        Thread decrementor = new Thread(new Decrementor(incrSemaphore,decrSemaphore));


        incrementor.start();
        decrementor.start();

        incrementor.join();
        decrementor.join();

    }

}
