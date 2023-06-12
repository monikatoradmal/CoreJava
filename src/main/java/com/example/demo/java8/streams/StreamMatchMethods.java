package com.example.demo.java8.streams;

import java.util.List;

public class StreamMatchMethods {

    public static void main(String[] args) {
        List<Course> courses= List.of(
            new Course("Java",98,12000),
            new Course("Spring",89,100),
            new Course("Spring Boot",100,15000),
            new Course("Spring MVC",900,9000),
            new Course("DB",7000,7000)
        );

        //1.allMatch() method checks condition for each element.Condition for all elements should be true
        //Accepts predicate object. If stream is empty then output is true
        boolean isAllMatch = courses.stream().allMatch(course -> course.getReviewScore() >= 90);
        System.out.println("All match ethod  ::" + isAllMatch);

        //2. anyMatch(). It will check any matching element and if found return true
        //and will not check rest of the elements

        boolean isAnyMatch = courses.stream().anyMatch(course -> course.getReviewScore() == 100);
        System.out.println("Any match method ::" + isAnyMatch);

        //3. noneMatch() : None of the element should match the predicate 
        //If first element is not matching with predicate then it will not check 
        //rest elements and will return false

        boolean isNoneMatch = courses.stream().noneMatch(course -> course.getStudents() <= 100 );
        System.out.println("None match method ::" + isNoneMatch);

    }
    
    
}
