package com.example.demo.collection.HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods2 {
    public static void main(String[] args) {

    Map<String,Integer> map = new HashMap<>();
    map.put("Monika", 100);
    map.put("Moni", 200);
    map.put("Mona", 300);
    map.put("Monalisa", null);

    map.forEach((k,v) -> System.out.println("Without compute : " + k + "-"+ v));
    //4. V compute(K key, BiFunction<K,V> remappingFunction) 
    map.compute("Monika", (k,v) -> v + 1);
    map.compute("Moni", (k,v) -> v + 1);
    map.compute("Mona", (k,v) -> v + 1);

    //Compute mapping for the specified key. If value is null then throws nullpointereception
    //map.compute("Monalisa", (k,v) ->  v + 1);
   // map.compute("Monalisa", (k,v) -> v == null ? 400 : v + 1);

    map.forEach((k,v) -> System.out.println("With compute : " + k + "-"+ v));

    //4. V computeIfAbsent(K key, Function<K,V> mappingFunction)
    map.computeIfAbsent("Monika", k -> k.length() );
    map.computeIfAbsent("Moni", k -> k.length());
    map.computeIfAbsent("Mona", k -> k.length());
    map.computeIfAbsent("Monalisa", k -> k.length()); 
    map.computeIfAbsent("Deepu", k -> k.length());
    map.forEach((k,v) -> System.out.println("With computeIfAbsent : " + k + "-"+ v));


    map.computeIfPresent("Monika", (k,v) -> v + 1);
    map.computeIfPresent("Moni", (k,v) -> v + 1);
    map.computeIfPresent("Mona", (k,v) -> v + 1);
    map.computeIfPresent("Deepu", (k,v) -> v + 1);
    map.forEach((k,v) -> System.out.println("With computeIfPresent : " + k + "-"+ v));




    }
    
}
