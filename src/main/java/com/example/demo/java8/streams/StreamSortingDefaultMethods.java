package com.example.demo.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamSortingDefaultMethods {

    public static void main(String[] args) {

        List<Person> personList = List.of(new Person("Monika",Gender.FEMALE,32),
        new Person("Sonali",Gender.FEMALE,34),
        new Person("Moni",Gender.FEMALE,30),
        new Person("Moni",Gender.FEMALE,30),
        new Person("Moni",Gender.FEMALE,30),
        new Person("Deepak",Gender.MALE,33));
        
        //reversed()
       // personListwithnull.stream().sorted(Comparator.comparing(Person::getName).reversed()).forEach(System.out::println);

        //thenComparing()
      /*/  List<Person> sorted = personList.stream()
                .sorted(Comparator.comparing(Person::getName)
                .thenComparingInt(Person::getAge)).collect(Collectors.toList());
                sorted.forEach(System.out::println);*/

        List<String> list = List.of("Hello","My","Name");
       String s =  list.stream().collect(Collectors.joining("|","(",")"));
       System.out.println(s);

       List<Employee> emplist = List.of(
        new Employee("Monika", 32, 1000,"IT"),
        new Employee("Deepak", 34, 2000,"IT"),
        new Employee("Moni", 30, 3000,"Comp"),
        new Employee("Soni", 32, 4000,"Comp")        
    );
    

    //double salarysum = emplist.stream().collect(Collectors.summingDouble(Employee::getSalary));
   // System.out.println(salarysum);
       Map<Integer,List<Employee>> groupbyAge= emplist.stream().collect(Collectors.groupingBy(Employee::getAge));
      // groupbyAge.forEach((k,v) -> System.out.println(k +" - "+ v));
       /*
        * 
        32 - [Monika:32:1000.0, Soni:32:4000.0]
        34 - [Deepak:34:2000.0]
        30 - [Moni:30:3000.0]

        */

        List<Employee> emplistDept = List.of(
        new Employee("Monika", 32, 1000,"IT"),
        new Employee("Deepak", 34, 2000,"IT"),
        new Employee("Moni", 30, 3000,"Comp"),
        new Employee("Soni", 32, 4000,"Comp")        
    );

   Map<String,Double> map=  emplistDept.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));

    map.forEach((k,v) -> System.out.println(k + "-"+v));
    }
    
}
