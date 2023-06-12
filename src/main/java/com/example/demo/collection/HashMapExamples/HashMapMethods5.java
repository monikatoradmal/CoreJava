package com.example.demo.collection.HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods5 {

    public static void main(String[] args) {
        
        Map<String,Integer> map = new HashMap<>();

        //14 V put(K key,V value)
        /*If key is already present then new value will get replace.
        If key is absent then null value will get return */
        map.put("Sonika", 100);
        map.put("Soni", 200);
        map.put("Sona", 300);
        map.put("Sonalisa", null);
        map.put(null, null);
        map.put(null, 400);
        map.put("Deepak", null);

      //map.forEach((k,v) -> System.out.println(k + " - " + v));

       //15 V putIfAbsent(K key, V value)
       /* 1 - If key is already present with some value then just return that value without updating new value
        * 2. If key have null value then replace new value
        * 3. If key is absent then put in map 
        */ 
       System.out.println(map.putIfAbsent("Sonika", 500)); //Key already present don't replace value return existing value
       System.out.println(map.putIfAbsent("Monika", 100)); //key not present . put in map
       System.out.println(map.putIfAbsent("Sonalisa", 100)); //key with previous null value. Replace new value
       System.out.println(map.putIfAbsent("Deepak", null));//present key with null value will remain null
       map.forEach((k,v) -> System.out.println(k + " - " + v));


    }
    
}
