package com.company.atomicOperations;

import java.util.concurrent.atomic.AtomicInteger;

public class Shared {
    public static AtomicInteger counter = new AtomicInteger(0);
}
