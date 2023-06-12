package com.example.demo.concurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);
        new PrintThread(1,semaphore).start();
        new PrintThread(2,semaphore).start();
        new PrintThread(3,semaphore).start();
        new PrintThread(4,semaphore).start();
        new PrintThread(5,semaphore).start();      

        
    }
}

class PrintThread extends Thread{
    int id;
    Semaphore semaphore;

    public PrintThread(int id,Semaphore semaphore){
        this.id = id;
        this.semaphore = semaphore;
    }

    public void run(){
        try{
            semaphore.acquire();
            System.out.println(Thread.currentThread());
            System.out.println("Printing " + id);
            Thread.sleep(5000);
            semaphore.release();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
