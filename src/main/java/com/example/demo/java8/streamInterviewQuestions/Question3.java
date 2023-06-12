package com.example.demo.java8.streamInterviewQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question3 {

    public static void main(String[] args) {
        /*
         * Find second highest element from array
         * int numbers = {5,9,11,2,8,21,1}
         * 
         */

        // int[] numbers = {5,9,11,2,8,21,1};

        List<Integer> numbers = List.of(5,9,11,2,8,21,1);
        Optional<Integer> secondHigh = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHigh.isPresent() ? secondHigh.get() : 0);
    }
    
}
