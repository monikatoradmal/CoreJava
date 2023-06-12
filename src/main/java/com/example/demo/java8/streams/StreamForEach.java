package com.example.demo.java8.streams;


import java.util.List;
import java.util.function.Consumer;

public class StreamForEach {

    public static void main(String[] args) {
        /*  1. Iterate the collection and print with forEach() method.
        Stream is a interface introduced in Java8. forEach() method accepts object of
        Consumer which is a Functional interface having void accept(T) method
        */
        List<Integer> numbers = List.of(1, 2, 3, 4, 5,6,7,8); // List.of() introduced in Java 9
        numbers.stream().forEach(System.out::println); //forEach with method reference

        // Implementing accept() method with annonymous class
        // Consumer accepts one input and doen't return anything
        Consumer<Integer> consumer = new Consumer<>() {

            public void accept(Integer i) {

                System.out.println(i);

            }
        };
        numbers.stream().forEach(consumer);

        //Implementing accept() method with lambda expression.
        Consumer<Integer> consumeLambda = (i) -> System.out.println(i);
        numbers.stream().forEach(consumeLambda);

        //Add lambda expression in one line 
        numbers.stream().forEach(s-> System.out.println(s));
        
    }

}
