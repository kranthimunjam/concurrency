package com.company.callableAndFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> sumResult;
        Future<Double> lengthResult;
        Future<Integer> factorialResult;

        System.out.println("Starting computation...");

        sumResult = executorService.submit(new Sum(5));
        lengthResult = executorService.submit(new Length(3,4));
        factorialResult = executorService.submit(new Factorial(6));

        try{
            System.out.println(sumResult.get());
            System.out.println(lengthResult.get());
            System.out.println(factorialResult.get());
        } catch (InterruptedException e){
            System.out.println("Interrupted: "+e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //very important step
        executorService.shutdown();
        System.out.println("Computation finished...");
    }
}
