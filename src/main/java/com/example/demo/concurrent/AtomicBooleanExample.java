package com.example.demo.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanExample {

    public static void main(String[] args) {
        SharedService service = new SharedService();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0;i<3;i++){
            executorService.submit(new Runnable(){
                public void run(){
                    service.service();
                }

            });

            }

            executorService.shutdown();
        }     
}


class SharedService {

     AtomicBoolean initialized = new AtomicBoolean(false);;

    public void init(){
        if(! initialized.compareAndSet(false, true)){
            System.out.println("already initialized");
            return;
        } 
        Thread.yield();

       
        System.out.println("initializing....");
        


    }

    public void service(){
        //do initialization once
        init();

        System.out.println("Perform some task");
    }

}