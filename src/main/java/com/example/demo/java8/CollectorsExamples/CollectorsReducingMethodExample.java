package com.example.demo.java8.CollectorsExamples;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CollectorsReducingMethodExample {

    public static void main(String[] args) {

    /*
     * Find oldest person from each city
     * 
     * city oldPersonAge
     */

    List<Person> list = List.of(new Person("Monika",18,"Pune"),
    new Person("Joe",17,"Canada"),
    new Person("Bob",22,"London"),
    new Person("Alice",16,"London"),
    new Person("Hari",16,"Pune"),
    new Person("Jim",46,"Canada"),
    new Person("Bob",16,"Pune"),
    new Person("Alice",40,"Pune")   
    );

    Map<String,Optional<Person>> map=list.stream()
                    .collect(Collectors.groupingBy(Person::getCity
                    ,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Person::getAge)))));

    map.forEach((k,v) -> System.out.println(k + "-" +v.get()));
    /*
     *  Canada-Person [name=Jim, age=46, city=Canada]
        London-Person [name=Bob, age=22, city=London]
        Pune-Person [name=Alice, age=40, city=Pune]
     * 
     * 
     * 
     */
        
    }
    
}
