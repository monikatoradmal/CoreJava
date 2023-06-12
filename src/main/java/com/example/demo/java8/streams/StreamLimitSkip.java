package com.example.demo.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitSkip {
    public static void main(String[] args) {
        List<Course> courses= List.of(
            new Course("Java",98,12000),
            new Course("Spring",89,100),
            new Course("Spring Boot",100,15000),
            new Course("Spring MVC",900,9000),
            new Course("DB",7000,7000)
        );


        //1. limit() - To get/return given number of elemnts from list 
        List<Course> limitList= courses.stream().limit(2).collect(Collectors.toList());
        System.out.println(limitList);

        //Problem Statement : Find the max review score course
        courses.stream().sorted().limit(1).forEach(course -> System.out.println(course));
        
        //2. skip() - to skip given number of elements 
        List<Course> skipList = courses.stream().skip(2).collect(Collectors.toList());
        System.out.println(skipList);
        

        
    }
}
