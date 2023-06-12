package com.example.demo.java8.streamInterviewQuestions;

import java.util.List;
import java.util.function.BinaryOperator;

public class Question7 {

    public static void main(String[] args) {

    /*Find the employee who stays in longest length city */
        
    List<Employee> empList = List.of(new Employee("Monika", 150000, "Pune"),
                                    new Employee("Bob", 200000, "London"),
                                    new Employee("Alice", 10000, "Newyork"),
                                    new Employee("John", 350000, "Delhi"));
    BinaryOperator<Employee> op = new BinaryOperator<Employee>() {

        @Override
        public Employee apply(Employee e1, Employee e2) {
            
            return e1.getCity().length() > e2.getCity().length() ? e1 :e2;
        }
        
    };

   // Employee e = empList.stream().peek(System.out::println).reduce((e1,e2) -> e1.getCity().length() > e2.getCity().length() ? e1 : e2).get();
    Employee e = empList.stream().reduce((e1,e2) -> op.apply(e1, e2)).get();
    System.out.println("Longest city emp : " + e);
    }
    
}
