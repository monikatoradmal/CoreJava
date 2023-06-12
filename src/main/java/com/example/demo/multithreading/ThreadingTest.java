package com.example.demo.multithreading;

public class ThreadingTest {

    public static void main(String[] args){

        //as class has extended Thread class , subclass is acting like thread only
        WithThreadClass threadclass = new WithThreadClass();
        threadclass.start();

        //by implementing Runnable interface class will be normal class. We need to submit the task for execution 
        WithRunnable withRunnable = new WithRunnable();
        Thread thread = new Thread(withRunnable);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        System.out.println("thread from main class");

    }
    
}
