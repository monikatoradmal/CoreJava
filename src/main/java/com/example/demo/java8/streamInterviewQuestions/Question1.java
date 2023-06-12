package com.example.demo.java8.streamInterviewQuestions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question1 {
    
    public static void main(String[] args) {
        
        //first nonrepeat element
    
    String nonrepeat = List.of("sollsp".split("")).stream()
    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
    .entrySet().stream().filter(e1 -> e1.getValue()==1).findFirst().get().getKey();
     System.out.println(nonrepeat);
    }
}
