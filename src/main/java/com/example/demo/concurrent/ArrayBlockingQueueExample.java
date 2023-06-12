package com.example.demo.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExample {

    public static void main(String[] args) {
        
        //Create Blocking queue 
        BlockingQueue<String> arrBlockingQueue = new ArrayBlockingQueue<>(2);

        //Create producer who will push the element in queue
        new ProducerThread(arrBlockingQueue).start();


        //create consumer who will pull the element from queue
        new ConsumerThread(arrBlockingQueue).start();


    }
    
}


class ProducerThread extends Thread{

    BlockingQueue<String> queue;

    public ProducerThread(BlockingQueue<String> queue){
        this.queue = queue;
    }

    

    //Implement run method
    public void run(){
        for (int i =1; i<=10;i++){
            String msg = "hello" + i;

        try{
            //Put method blocks the thread till space  is available
            queue.put(msg);
            System.out.println("Producer published the message " + msg);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
}



}


class ConsumerThread extends Thread{

    BlockingQueue<String> queue;

    public ConsumerThread(BlockingQueue<String> queue){
        this.queue = queue;
    }

    

    //Implement run method
    public void run(){
        for (int i =1; i<=10;i++){
            String msg = null;

        try{
            //take  method will return head element and blocks the thread if queue is empty and will wait till element is available
            msg = queue.take();
            System.out.println("Consumer read the message " + msg);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
}
}