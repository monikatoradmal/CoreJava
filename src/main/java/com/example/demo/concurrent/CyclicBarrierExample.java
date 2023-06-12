package com.example.demo.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    public static void main(String[] args) {
        //we have mentioned 2 parties means it will wait till 2 threads are ready
        CyclicBarrier barrier = new CyclicBarrier(2);

        //Participant A
        new A(barrier).start();

        //Both these threads will start once they are ready. They will not wait for each other
        try { Thread.sleep(5000);}catch(InterruptedException e){ e.printStackTrace();}
        
        //Participant B
        new B(barrier).start(); 
       
    }
    
    
}

class A extends Thread{
    CyclicBarrier barrier;

    public A(CyclicBarrier barrier){
        this.barrier = barrier;
    }

    public void run(){

        try {barrier.await();} catch(InterruptedException | BrokenBarrierException e){e.printStackTrace();}
        System.out.println("A begins....");
    }

}

class B extends Thread{
    CyclicBarrier barrier;

    public B(CyclicBarrier barrier){
        this.barrier = barrier;
    }
    public void run(){
        try {barrier.await();} catch(InterruptedException | BrokenBarrierException e){e.printStackTrace();}
        System.out.println("B begins....");
    }

}
