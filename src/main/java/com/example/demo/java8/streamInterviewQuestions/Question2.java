package com.example.demo.java8.streamInterviewQuestions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question2 {

    public static void main(String[] args) {
        /*Count the occurence of each character from a string 
        * e.g monika
        * m = 1,o=1,n=1,i=1,k=1,a=1
        */

    //String s = "monika";
    String s = "IloveIndia";
        Map<String,Long> map = List.of(s.split("")).stream()
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(Map.Entry<String,Long> entry :map.entrySet()){ 
        //System.out.println(entry.getKey() + "-" + entry.getValue());
    }
    

    /*Find the duplicate element from given String  */
    for(Map.Entry<String,Long> entry :map.entrySet()){
        if(entry.getValue()>1)
        //System.out.println("This is a duplicate character : "+ entry.getKey() + "-" + entry.getValue());

    //Another solution to find duplicate elements
    
     List.of("MNMN".split("")).stream()
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                    .entrySet().stream().filter(e -> e.getValue()>1)
                    .map(e -> e.getKey() + "-" + e.getValue() )
                    .collect(Collectors.toList()).forEach(System.out::println);
     
     
   

    
    
}
}
}
