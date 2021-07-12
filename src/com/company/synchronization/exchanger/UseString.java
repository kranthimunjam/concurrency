package com.company.synchronization.exchanger;

import java.util.UUID;
import java.util.concurrent.Exchanger;

public class UseString implements Runnable{
    Exchanger<String> exchanger;
    String str = "";
    UseString(Exchanger<String> exchanger){
        this.exchanger = exchanger;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i=0; i < 3; i++) {
            try {
                // Exchange an empty buffer for a full one.
                str = exchanger.exchange("");
                System.out.println("Got: " + str);
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }
}
