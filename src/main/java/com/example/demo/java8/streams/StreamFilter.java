package com.example.demo.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilter {

    public static void main(String[] args) {
    
    /*Stream is a interface introduced in java 8. It have filter() method
    which accepts Predicate object. Predicate is functional interface.
    It have test() method which accepts T input and returns boolean.

    filter() method is used to filter out elements with specific condition
    e.g find odd,even numbers.find strings with particular length 
    */

    List<Integer> numbers = Arrays.asList(2,5,8,3,10,23,26);
    numbers.stream().filter(n-> n%2==0).forEach(n->System.out.println(n));

    //Predicate interface with annonymous inner class
    Predicate<Integer> predicate = new Predicate<>() {
        public boolean test(Integer n){
            return n%2==0;
        }
    };
    numbers.stream().filter(predicate).forEach(System.out::println);

    //Predicate interface with lambda expression
    Predicate<Integer> predLambda = (n) -> {
        return (n%2==0);
         
    };
    numbers.stream().filter(predLambda).forEach(System.out::println);



    }
    
  
}
