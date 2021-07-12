package com.company.synchronization.exchanger;

import java.util.UUID;
import java.util.concurrent.Exchanger;

public class MakeString implements Runnable{
    Exchanger<String> exchanger;
    String generated = "";
    MakeString(Exchanger<String> exchanger){
        this.exchanger = exchanger;
        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch = 'A';
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++)    generated += ch++;
            try {
                System.out.println("Generated string "+generated+" waiting to be exchanged...");
                generated = exchanger.exchange(generated);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
