package com.example.demo.collection.HashMapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods3 {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Monika", 100);
        map.put("Sonika", 200);
        map.put("Tonika", 300);

        //5. boolean containsKey(Object key)
        System.out.println("Is Sonika Present : "+ map.containsKey("Sonika"));
        System.out.println("Is Lonika Present : "+ map.containsKey("Lonika"));
        
        //6 boolean containsValue(Object value)
        System.out.println("Is 400 Present : "+ map.containsValue(400));
        System.out.println("Is 200 Present : "+ map.containsValue(200));

        
        //7 Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry<String,Integer>> mapinSet = map.entrySet();
        mapinSet.forEach(s -> System.out.println(s.getKey() + s.getValue()));

        for(Map.Entry<String,Integer> entry : mapinSet){
            System.out.println(entry.getKey() + entry.getValue());
        }

        //8 void forEach(BiConsumer<K,V> action)
        map.forEach((k,v) -> System.out.println(k + "-"+ v));
    
        
        
        
        
    }
    
}
