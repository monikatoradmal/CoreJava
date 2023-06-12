package com.example.demo.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWhileMethods {

    //takeWhile() and dropWhile()

    public static void main(String[] args) {
        List<Course> courses= List.of(
            new Course("Java",100,12000),
            new Course("Spring",70,100),
            new Course("Spring Boot",100,15000),
            new Course("Spring MVC",80,9000),
            new Course("DB",7000,7000)
        );

        //1. takeWhile() Checks predicate.If not matches for first element then false.
        //If matches for first and not with second then return only first element and return 
        //Return the list until predicate matches. If fail at any elment then skip rest elemnets

        List<Course> takeWhileList = courses.stream()
                                            .takeWhile(course -> course.getReviewScore() >=100)
                                            .collect(Collectors.toList());

        //System.out.println(takeWhileList);

        //2. dropWhile() - iterate the list till matching the predicate. If not matching with predicate then return 
        //all elements after that.If condition is false for first element then return all elements
        List<Course> dropWhileList = courses.stream()
                                            .dropWhile(course -> course.getReviewScore() >=100)
                                            .collect(Collectors.toList());
        System.out.println(dropWhileList);

        Stream<Integer> stream= Stream.of(2,4,5,8,7,4,9);
        List<Integer> list = stream.dropWhile(n -> n/2 == 1).collect(Collectors.toList());
       System.out.println(list);

        


        /*
        takeWhile()
        List<Course> takeWhileList = courses.stream()
                                            .takeWhile(course -> course.getReviewScore() >=100)
                                            .collect(Collectors.toList());

         * I/P new Course("Java",100,12000),
            new Course("Spring",89,100),
            new Course("Spring Boot",100,15000),
            new Course("Spring MVC",80,9000),
            new Course("DB",7000,7000)
         * O/P [Course [course=Java, reviewScore=100, students=12000]]
         */

    }
    
}
