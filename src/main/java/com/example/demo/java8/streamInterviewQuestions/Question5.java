package com.example.demo.java8.streamInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class Question5 {

    public static void main(String[] args) {
        /*
         * elements start with 1
         */

    int[] arr = {2,11,34,1,45,19};
        Arrays.stream(arr).boxed().map(s -> s+"").filter(s ->s.startsWith("1"))
        .forEach(System.out::println);
    }
    
}
