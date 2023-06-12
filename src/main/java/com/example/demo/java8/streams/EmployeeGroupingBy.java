package com.example.demo.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeGroupingBy {

    public static void main(String[] args) {
        //GroupingBy all overloaded methods of java 8 stream

        List<Employee> list = List.of(
            new Employee("Monika", 32, 100000),
            new Employee("Deepak", 34, 200000),
            new Employee("Moni", 30, 1500000),
            new Employee("Soni", 32, 1700000),
            new Employee("Moni", 30, 1500000),
            new Employee("Soni", 32, 1700000),
            new Employee("Luna", 32, 1800000),
            new Employee("Deepu", 40, 1000000)
        );

        //Group by age. In this overloaded method of groupingBy it just accepts function in input on which we 
        //have to do grouping. By default put K,V in HashMap and creates values as list
        Map<Integer,List<Employee>> groupByAge= list.stream()
                                            .collect(Collectors.groupingBy(emp ->emp.getAge()));
       //groupByAge.forEach((k,v) -> System.out.println(k + ":" +v));
        /* This was normal grouping by age by putting result in HashMap
        32:[Monika:32:100000.0, Soni:32:1700000.0, Luna:32:1800000.0]
        34:[Deepak:34:200000.0]
        40:[Deepu:40:1000000.0]
        30:[Moni:30:1500000.0] 
         * 
         * 
         */

        //Group by age and get values in set. Set doesn't contain duplicate elements. If we are adding custom
        //objects in set then we need to override equals() method to check equality of each member.
        //in this overloaded method of groupingBy it  accepts function in input on which we 
        //have to do grouping.Also accepts the type of downstream for values. By default put K,V in HashMap
        Map<Object,Set<Employee>> groupByAgeWithSet = list.stream().collect(Collectors.groupingBy(emp -> emp.getAge(),Collectors.toSet()));
        //groupByAgeWithSet.forEach((k,v) ->System.out.println(k + ":" +v));


        ////in this overloaded method of groupingBy it  accepts function in input on which we 
        //have to do grouping.Also accepts the type of downstream for values like List,Set. Also we can mention the 
        //Map we want
        //list.stream().collect(Collectors.groupingBy(classifier, mapFactory, downstream));
        Map<Object,Set<Employee>> groupByProvidedMap = list.stream().collect(Collectors.groupingBy(e -> e.getAge(), TreeMap::new, Collectors.toSet()));

        groupByProvidedMap.forEach((k,v) -> System.out.println(k + ":" +v));


        //Map<Object,Optional<List<Employee>>> sortWithSalary = list.stream().
                                                           // collect(Collectors.groupingBy(emp -> emp.getAge(), Collectors.maxBy(Comparator.comparing(emp -> emp.getAge()))));
    }
    
}
