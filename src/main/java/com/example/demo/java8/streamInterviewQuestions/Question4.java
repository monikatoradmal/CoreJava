package com.example.demo.java8.streamInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {

    public static void main(String[] args) {
        /*
         * find longest string from array
         * String[] arr = {"java","Spring","SpringBoot"}
         * -> Longest string = SpringBoot
         */

        String[] arr = {"java","Spring","SpringBoot","tpringBooS","SrpingBoot"};

       String longestString =  Arrays.stream(arr).reduce((s1,s2) -> s1.length() > s2.length() ? s1 :s2).get();
       System.out.println(longestString);
                
}
}
