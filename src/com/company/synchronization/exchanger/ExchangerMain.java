package com.company.synchronization.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerMain {
    public static void main(String args[]){
        /*
        It simply waits until two separate threads call its exchange( ) method.
        When that occurs, it exchanges the data supplied by the threads.
        Here it exchanges String data between threads.
         */
        Exchanger<String> exchanger = new Exchanger<>();

        new MakeString(exchanger);
        new UseString(exchanger);
    }
}
