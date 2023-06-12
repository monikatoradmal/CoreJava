package com.example.demo.java8.streams;

import java.util.Comparator;
import java.util.List;



public class StreamAggregateMethods {

    //sum(), average(),count(). Sum() and average() available when mapping to primitive
    //max(),min(),findFirst(),findAny()
    public static void main(String[] args) {
        List<Course> courses= List.of(
            new Course("Java",98,12000),
            new Course("Spring",89,100),
            new Course("Spring Boot",100,15000),
            new Course("Spring MVC",900,9000),
            new Course("DB",7000,7000)
        );
    
    //1. count() - to get the count of elements from stream or by applying some predicate
    System.out.println(courses.stream()
                                    .filter(course -> course.getReviewScore() >=100)
                                    .count()
                                    ); //output = 3

    //2. sum()
    System.out.println(courses.stream()
                    .mapToInt(course -> course.getStudents()).sum()
                    ); //Output : 43100
                    
    //3. average()
    System.out.println(courses.stream()
                    .mapToInt(course -> course.getStudents()).average()
                    ); //Output : OptionalDouble[8620.0]

    //4. max()
    System.out.println(courses.stream()
                                .max(Comparator.comparing(Course::getStudents))); //by dafault natural sorting is happening and max() is returning last element
                                //output:Optional[Course [course=Spring Boot, reviewScore=100, students=15000]]


    //5 min()
    System.out.println(courses.stream()
                                      .min(Comparator.comparing(Course::getReviewScore)));   
                                      //Output : Optional[Course [course=Spring, reviewScore=89, students=100]] 
                                      
    //6 findFirst()
    
    System.out.println(courses.stream()
                                .filter(course -> course.getReviewScore() >= 100)
                                .findFirst().orElse(new Course("Default Course",7000,700)));
                                //output : Course [course=Spring Boot, reviewScore=100, students=15000]
    
    //7 findAny - returns any predicate matching element
    System.out.println(courses.stream()
    .filter(course -> course.getReviewScore() < 100)
    .findAny().orElse(new Course("Default Course",70,700)));
    
    }
    
}
