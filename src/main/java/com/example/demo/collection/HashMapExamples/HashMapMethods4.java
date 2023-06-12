package com.example.demo.collection.HashMapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods4 {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Monika", 100);
        map.put("Moni", 200);
        map.put("Mona", 300);
        map.put("Monalisa", null);

        //9. V get(Object Key) - get the value for the specified key and if not present return null
       // Integer value = map.get("Monika");
        System.out.println(map.get("Monika")); //100
        //Integer valueNull = map.get("MonikaT");
        System.out.println(map.get("MonikaT")); //null

        //10 V getOrDefault(Object key, V defaultvalue)
        System.out.println(map.getOrDefault("Moni", null)); //200
        System.out.println(map.getOrDefault("MoniT", 111)); //111

        //11 boolean isEmpty()
        System.out.println(map.isEmpty()); //false

        //12 Set<K> ketSet() - returns all keys from map
        Set<String> allKey = map.keySet();
        allKey.forEach(System.out::println);

        //13 V merge(K key, V value,BiFunction remappingFunction). 
        /*If key is not present already then it will add passed value in map else if key is 
        already present then it will calculate updated value with remapping function.
         */
        System.out.println(map.merge("Mini", 500, (oldvalue,newvalue) -> oldvalue + newvalue)); //500
        System.out.println(map.merge("Mona", 600, (oldvalue,newvalue) -> oldvalue + newvalue)); //900
        System.out.println(map.merge("Monalisa", 1000, (oldvalue,newvalue) -> oldvalue + newvalue)); //null value replaced with 1000
    }
    
}
