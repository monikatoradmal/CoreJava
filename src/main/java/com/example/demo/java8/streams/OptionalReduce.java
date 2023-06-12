package com.example.demo.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class OptionalReduce {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,5);

        BinaryOperator<Integer> function = (s,n) -> s+=n;
       // Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        //Optional<Integer> sum = numbers.stream().reduce((s,n) -> function.apply(s, n));
        Optional<Integer> sum = numbers.stream().reduce((s,n) -> s+=n);
        Integer i = sum.isPresent() ? sum.get() :0;
        System.out.println("sum is " + i);

        double addition = numbers.stream().
                            reduce(0.0,(s,n) -> s+n,Double::sum);
                            System.out.println("Addition is " + addition);

     

        
    }
    
}
