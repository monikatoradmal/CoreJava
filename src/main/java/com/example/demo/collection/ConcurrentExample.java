package com.example.demo.collection;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConcurrentExample {

    public static void main(String[] args) {
        
        List<String> list = List.of("abc","abc","monika","sonali");
        Map<String,Integer> map = new ConcurrentHashMap<>();

        for(String s : list){
            map.compute(s,(k,v) -> v==null?1:v+1);
        }

       // map.forEach((k,v) -> System.out.println(k + " - " +v));

        List<String> list1 = List.of("abc","abc","monika","sonali");

        Map<String,Long> mapWord = list1.stream()
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

                        //mapWord.forEach((k,v) -> System.out.println(k + " --- " +v));

                        Map<String,Long> mapWordnew=  mapWord.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));  
                        mapWordnew.forEach((k,v) -> System.out.println(k + " ----- " +v));
}
}
