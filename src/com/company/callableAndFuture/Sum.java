package com.company.callableAndFuture;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    Integer number, sum=0;
    public Sum(Integer number){
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        for(int i=0;i<=number;i++){
            sum+=i;
        }
        return sum;
    }
}
