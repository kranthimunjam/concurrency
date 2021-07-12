package com.company.locks.example1;

/**
 * lock( ) : Waits until the invoking lock can be acquired.
 * void lockInterruptibly( ) throws InterruptedException : Waits until the invoking lock can be acquired, unless interrupted.
 * Condition newCondition( ) : Returns a Condition object that is associated with the invoking lock.
 * boolean tryLock( ) : Attempts to acquire the lock. This method will not wait if the lock is unavailable. Instead, it returns true if the lock has been acquired and false if the lock is currently in use by another thread.
 * boolean tryLock(long wait, TimeUnit tu) throws InterruptedException : Attempts to acquire the lock. If the lock is unavailable, this method will wait no longer than the period specified by wait, which is in tu units. It returns true if the lock has been acquired and false if the lock cannot be acquired within the specified period.
 * void unlock( ): Releases the lock.
 *
 * The newCondition( ) method returns a Condition object associated with the lock. Using a Condition, you gain detailed control of the lock through methods such as await( ) and signal( ), which provide functionality similar to Object.wait( ) and Object.notify( ).
 */

public class LockMain {
    public static void main(String[] args){
        new TaskThread("A");
        new TaskThread("B");
    }
}
