package com.example.demo.collection.HashMapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapMethods1 {

    public static void main(String[] args) {
        
        //1 void clear() - removes all entries from map and makes map empty
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Monika", 32);
        map.put("Moni", 34);
        map.put("Monalisa", 20);
        
        
        map.forEach((k,v) -> System.out.println("Key is :" +k + "-" + "Value is :"+v));
        //map.clear();
        //map.forEach((k,v) -> System.out.println("Key is :" +k + "-" + "Value is :"+v));

        //2 Object clone() - returns shallow copy of HashMap instance.Keys and values are not cloned
        Object clonedMap = map.clone();
        System.out.println("With clone() method" + clonedMap);

        //Other ways to shallow copy map - Pass map in constructor, putAll() method and with stream api
        HashMap<String,Integer> shallowCopy1 = new HashMap<>(map);
        shallowCopy1.forEach((k,v) -> System.out.println("shallow1 Key is :" +k + "-" + " Value is :"+v));

   

        //3 void putAll(Map m) - Copies all of the mappings from the specified map
        HashMap<String,Integer> shallowCopy2 = new HashMap<>();
        shallowCopy2.putAll(map);
        shallowCopy2.forEach((k,v) -> System.out.println("shallow2 Key is :" +k + "-" + " Value is :"+v));

        HashMap<String,Integer> shallowCopy3 = (HashMap<String,Integer>)map.entrySet().stream()
                                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        shallowCopy3.forEach((k,v) -> System.out.println("shallow3 Key is :" +k + "-" + " Value is :"+v));

        System.out.println(map.hashCode() == clonedMap.hashCode()); //true
        System.out.println(shallowCopy1.hashCode() == shallowCopy2.hashCode()); //true
        System.out.println(shallowCopy2.hashCode() == shallowCopy3.hashCode()); //true
        System.out.println(clonedMap.hashCode() == shallowCopy3.hashCode()); //true

    }
    
}
