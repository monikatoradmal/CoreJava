package com.example.demo.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class StreamFlatMap {

    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee("Monika", 32, 100000,List.of("Pune","Mumbai")),
            new Employee("Deepak", 34, 200000,List.of("Banglore","Mumbai")),
            new Employee("Moni", 30, 1500000,List.of("Pune","Chennai")),
            new Employee("Soni", 32, 1700000,List.of("Pune","London")),       
            new Employee("Luna", 32, 1800000,List.of("London","Mumbai")),
            new Employee("Deepu", 40, 1000000,List.of("Pune","Mumbai"))
        );

        //Normal map()
        System.out.println(list.stream().map(emp ->emp.getName()).collect(Collectors.toList()));

        System.out.println(list.stream().map(emp ->emp.getCities()).collect(Collectors.toList()));
        //without flatmap - [[Pune, Mumbai], [Banglore, Mumbai], [Pune, Chennai], [Pune, London], [London, Mumbai], [Pune, Mumbai]]

        //with flatMap()
        System.out.println(list.stream().flatMap(emp ->emp.getCities().stream()).collect(Collectors.toSet()));

        List<Employee> emp = List.of(
            new Employee("Monika",List.of(12.3,45.5)),
            new Employee("Deepak",List.of(12.3,67.8)),
            new Employee("Moni", List.of(23.3)),
            new Employee("Soni", List.of(67.8)),       
            new Employee("Luna", List.of(12.3)),
            new Employee("Deepu", List.of(90.0,100.3))
        );

      

       
        
    }
    
}
