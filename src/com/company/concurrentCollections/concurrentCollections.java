package com.company.concurrentCollections;

import java.util.concurrent.*;

/**
 * As explained, the concurrent API defines several collection classes that have been engineered for concurrent operation.
 * They are
 * ArrayBlockingQueue
 * ConcurrentHashMap
 * ConcurrentLinkedQueue
 * ConcurrentSkipListMap (Added by Java SE 6.)
 * ConcurrentSkipListSet (Added by Java SE 6.)
 * CopyOnWriteArraylist
 * CopyOnWriteArraySet
 * DelayQueue
 * LinkedBlockingDeque (Added by Java SE 6.)
 * LinkedBlockingQueue
 * PriorityBlockingQueue
 * SynchronousQueue
 * These offer concurrent alternatives to their related classes defined by the Collections Framework. These collections work much like the other collections except that they provide concurrency support. Programmers familiar with the Collections Framework will have no trouble using these concurrent collections.
 */
public class concurrentCollections {
    ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue(10);
    ConcurrentHashMap<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();
    ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
    ConcurrentSkipListMap<Integer,Integer> concurrentSkipListMap = new ConcurrentSkipListMap<>();//(Added by Java SE 6.)
    ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<>(); //Added by Java SE 6.)
    CopyOnWriteArrayList<String> copyOnWriteArraylist = new CopyOnWriteArrayList<>();
    CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
    // DelayQueue<String> delayQueue = new DelayQueue<String>();
    LinkedBlockingDeque<String> linkedBlockingDeque = new LinkedBlockingDeque<>();//(Added by Java SE 6.)
    LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
    PriorityBlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<>();
    SynchronousQueue<String> stringSynchronousQueue = new SynchronousQueue<>();
}
