package com.example.demo.logical;

import java.util.HashMap;
import java.util.Map;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentHashMap;

public class FindSingleElementFromArray {
    

    public static void main(String[] args){
        Integer arr[]= {4,5,6,2,1,5,2,5};
       Map<Integer,AtomicInteger> map = new ConcurrentHashMap<Integer,AtomicInteger>();
        
        for(Integer i :arr){
          map.computeIfAbsent(i, v -> new AtomicInteger(0)).incrementAndGet();
       }

       

       map.forEach((k,v) -> System.out.println(k+ " : " + v));
    
       
        //iterate the map and get the key-value whoes count =1
       
       
        
    }
   
}

