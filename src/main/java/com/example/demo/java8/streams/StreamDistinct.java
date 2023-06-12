package com.example.demo.java8.streams;

import java.util.List;

public class StreamDistinct {

    public static void main(String[] args) {
        List<String> course = List.of("Java","Spring","java","DB","Spring");
        course.stream().distinct().forEach(System.out::println);

     
    }
    
    
}
