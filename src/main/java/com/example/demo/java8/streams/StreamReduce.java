package com.example.demo.java8.streams;

import java.util.List;
import java.util.Optional;

public class StreamReduce {

    public static void main(String[] args) {
        
    /* reduce() is a method of Stream interface. Used for aggregate functions
    *  reduce() method accepts identity i.e some default value and accumulator
    * accumulator is a object of BiOperator/BiFunction functional interface
    */

    List<Integer> numbers = List.of(1,2,3,4,5);
    //To find the sum of all elements
    Integer i = numbers.stream().reduce(0,(a,b) -> a+b);
    System.out.println("Sum is " + i);

    //With Method ref
    Integer sum1= numbers.stream().reduce(0,Integer::sum);
    System.out.println("Sum is " + sum1);

    Optional<Integer> sum2= numbers.stream().reduce(Integer::sum);
    System.out.println("Sum is with optional " + sum2.get());  
    
    //reduce() to get min value from list
    Integer min = numbers.stream().reduce(Integer.MAX_VALUE, (a,b) -> a>b ? b:a);
    System.out.println("Min value is " + min);

    Integer max= numbers.stream().reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a:b);
    System.out.println("Max value is " + max);
    
    //Sum of square 
    List<Integer> list= List.of(2,4,6,8);
    Integer sqaureSum = list.stream().map(n -> n*n).reduce(0, (a,b)-> a+b);
    System.out.println("Sum of sqaure numbers is " + sqaureSum);
}
    
}
