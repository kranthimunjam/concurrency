package com.company.threadSuspendResumeStop;

public class MyThread implements Runnable {
    private boolean isSuspended = false;
    Thread t;

    public MyThread(String name){
        t = new Thread(this,name);
        isSuspended = false;
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i = 0; i< 10;i++){
                System.out.println(i);
                Thread.sleep(300);
                synchronized (this){
                    while(isSuspended) {
                        wait();
                    }
                }
            }

        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    synchronized public void  suspendThread(){
        System.out.println("Suspending the thread");
        isSuspended  = true;
    }

    synchronized public void resumeThread(){
        System.out.println("Resuming the thread");
        isSuspended = false;
        notify();
    }
}
