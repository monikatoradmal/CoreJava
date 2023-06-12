package com.example.demo.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
    
    public static void main(String[] args) {
        
        new UserMigrationTask().start();

    }
}

class UserMigrationTask extends Thread{

    public void run(){

       
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CountDownLatch latch = new CountDownLatch(3);
        for(int i=1;i<=3;i++){
            int j= i;
            executor.submit( new Runnable() {
                public void run(){
                    System.out.println("Migrating Task -" + j);  //create this as seperate thread
                    latch.countDown();
                }               
            });
            
        }

        executor.shutdown();
        try{
            latch.await();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        

        System.out.println("Migration Completed");
    }
}
