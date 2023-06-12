package com.example.demo.java8.streamInterviewQuestions;

import java.util.Comparator;
import java.util.List;

public class Question6 {

    public static void main(String[] args) {

        /*
         * Find the second highest salary employee
         * 
        */

    List<Employee> empList = List.of(new Employee("Monika", 150000, "Pune"),
                                    new Employee("Bob", 200000, "London"),
                                    new Employee("Alice", 10000, "Newyork"),
                                    new Employee("John", 350000, "Delhi"));

    Employee e = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get();
    System.out.println(e);  
    }
    
}
