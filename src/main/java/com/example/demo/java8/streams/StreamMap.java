package com.example.demo.java8.streams;

import java.util.List;
import java.util.function.Function;

public class StreamMap {

    public static void main(String[] args) {
    /*map() is a method from Stream interface which accepts object of function interface
     * Function is a functional interface with T apply(T) method
     * map() method is used to perform some oprations on elemnts. It will map 
     * each object with provided function and will return 
     * e.g calculate length of the course
     */

    List<String> courses = List.of("DB","Spring MVC","Java", "Spring","Spring Boot","Data Structure");

    courses.stream().map(course -> course+" " + course.replaceAll("\\s","").length()).forEach(System.out::println);

    //Function Functional Interface- Annonymous inner class
    Function<String,String> function = new Function<>(){
        public String apply(String s){
            return s+" "+s.replaceAll("\\s", "").length();
        }

    };
    courses.stream().map(function).forEach(System.out::println);

    //Function interface with Lambda expression
    Function<String,String> funLambda =(s) -> {
        return s+" "+s.replaceAll("\\s", "").length();
    };

    courses.stream().map(funLambda).forEach(System.out::println);
    
    //Function interface returns output of any type
    Function<String,Integer> funLambda1 =(s) -> {
        return s.length();
    };

    courses.stream().map(funLambda1).forEach(System.out::println);
}

    

    
}
