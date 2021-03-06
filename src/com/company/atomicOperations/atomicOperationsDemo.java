package com.company.atomicOperations;

/**
 * An alternative to the other synchronization features when reading or writing the value of some types of variables.
 * This package offers methods that get, set, or compare the value of a variable in one uninterruptible (that is, atomic) operation.
 * This means that no lock or other synchronization mechanism is required.
 * Atomic operations are accomplished through the use of classes, such as AtomicInteger
 * and AtomicLong, and methods such as get( ), set( ), compareAndSet( ), decrementAndGet( ), and getAndSet( ), which perform the action indicated by their names.
 */
public class atomicOperationsDemo {
    public static void main(String[] args){
        new TaskThread("A");
        new TaskThread("B");
    }

}
