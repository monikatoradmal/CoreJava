package com.example.demo.concurrent;

import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
    public static void main(String[] args) {
        
    /*create priorityblocking queue for comparable objects. Integer class bu default implements 
    Comparable interface. Priority is set by comparing the objects. Dafault priority is from low to high*/
    BlockingQueue<Integer> queue = new PriorityBlockingQueue<Integer>();
    queue.add(10);
    queue.add(2);
    queue.add(9);

    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());


    /*
     *    //O/P
     *      2
            9   
            10  
            null
     * 
     * Next time create custom comparator class and pass it to queue 
     * to pass it to queue mention default capacity
     * 
     * PriorityBlockingQueue<Student> queue = new PriorityBlockingQueue<Student> (5, new StudentComparator())
     * 
     */


    }

    
    
   

    
}
