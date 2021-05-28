package com.company.callableAndFuture;

import java.util.concurrent.Callable;

public class Length implements Callable<Double> {
    double side1, side2;

    public Length(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }


    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1*side1)+(side2*side2));
    }
}
