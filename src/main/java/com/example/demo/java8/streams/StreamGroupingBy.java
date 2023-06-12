package com.example.demo.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamGroupingBy {

    //groupingBy()

    public static void main(String[] args) {
        
        List<Course> courses= List.of(
            new Course("Java",98,12000),
            new Course("Spring",89,100),
            new Course("Spring Boot",100,15000),
            new Course("Spring MVC",60,9000),
            new Course("DB",60,7000),
            new Course("AWS",100,19000)
        );

        
        System.out.println(courses.stream()
                            .collect(Collectors.groupingBy(Course::getReviewScore)) );
        //o/p : {98=[Java:98:12000], 100=[Spring Boot:100:15000, AWS:100:19000], 89=[Spring:89:100], 60=[Spring MVC:60:9000, DB:60:7000]}

        //Count of each category
        System.out.println(courses.stream()
                                .collect
                                (Collectors
                                .groupingBy(Course::getReviewScore,Collectors.counting())));
        //O/P : {98=1, 100=2, 89=1, 60=2}

        System.out.println(courses.stream()
                                    .collect(Collectors.groupingBy(Course::getCourse,
                                    Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

    }

    
}
