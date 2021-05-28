package com.company.callableAndFuture;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
    int number, result =1;

    public Factorial(int number){
        this.number = number;
    }


    @Override
    public Integer call() throws Exception {
        for(int i=1;i<=number;i++) result *= i;
        return result;
    }
}
