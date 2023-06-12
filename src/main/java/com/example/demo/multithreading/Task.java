package com.example.demo.multithreading;

public class Task implements Runnable {

    

    @Override
    public void run() {
        int i;
        for(i=0;i<10;i++){
            System.out.println("Executing Task" + i);
        }
        
        
    }
    
}
