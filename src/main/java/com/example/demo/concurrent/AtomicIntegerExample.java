package com.example.demo.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static void main(String[] args) {
        
        AtomicInteger i = new AtomicInteger(12);
        //expected value is the latest value of i
        boolean status = i.compareAndSet(10, 11);
        if(status){
            System.out.println("Value updated " + i);
        }else{
            System.out.println("Value was not set " + i);
        }

    }
    
}
