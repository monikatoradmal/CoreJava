package com.example.demo.java8.streamInterviewQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 {

    public static void main(String[] args) {
        /*
         * sort with name and then by city
         */
        List<Employee> empList = List.of(new Employee("Monika", 150000, "Pune"),
                                    new Employee("Bob", 200000, "London"),
                                    new Employee("Alice", 10000, "Newyork"),
                                    new Employee("John", 350000, "Delhi"),
                                    new Employee("John", 370000, "London"),
                                    new Employee("Alice", 10000, "Manila"));

                                    List<Employee> list = empList.stream().sorted(Comparator.comparing(Employee::getName)
                                    .thenComparing(Comparator.comparing(Employee::getCity)))
                                    .collect(Collectors.toList());
                                    list.forEach(System.out::println);

    }
    
}
