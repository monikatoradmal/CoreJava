package com.example.demo.collection.HashMapExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods6 {
    public static void main(String[] args) {
        
        Map<String,Integer> map = new HashMap<>();
        map.put("Sonika", 100);
        map.put("Soni", 200);
        map.put("Sona", 300);       
        map.put(null, 400);
        map.put("Deepak", null);

        //16 V remove(Object key) ---if key present then remove regardless of any value
        System.out.println(map.remove("Sona")); //300
        System.out.println(map.remove("dona")); //null

        //17 boolean remove(Object key, Object value) - remove key associated with passed value
        System.out.println(map.remove("Soni",900)); //false
        System.out.println(map.remove("Soni", 200)); //true

        //18 V replace(K key, V value) - will replace value regardless of any previous value and will return previous value
        System.out.println(map.replace("Deepak",3000));
        System.out.println(map.replace("Sonika", 1000));

        //19 boolean replace (K key, V oldValue, V newValue)
        System.out.println(map.replace("Deepak", 3000, 4000));

        //20 void replaceAll(BiFunction function)
        /*
         * Fucntion to replace all values
         */
        map.replaceAll((k,v) -> v+1000);
        map.forEach((k,v) -> System.out.println(k + "-" + v));

        //21 int size()
        System.out.println(map.size());

        //22 Collection<V> values()
        Collection<Integer> mapValues = map.values();
        mapValues.forEach(System.out::println);
    }
}
