package com.example.demo.java8.CollectorsExamples;

import java.util.Collection;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsExample1 {

    public static void main(String[] args) {

        /*
         * Collectors implement various useful reduction operations,
         * such as accumulating elements into collections,summarizing elements
         * according to various criteria
         * 
         */

    List<Person> list = List.of(new Person("Monika",18,"Pune"),
    new Person("Joe",17,"Canada"),
    new Person("Bob",22,"London"),
    new Person("Alice",16,"London")   
    );
    
   List<String> name = list.stream().map(Person::getName)
                                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

    
   /*
    name.add("Jim");  
    Exception in thread "main" java.lang.UnsupportedOperationException
        at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
   
   */                         
    name.forEach(System.out::println);
   
                                
    //String name = list.stream().map(Person::getName).collect(Collectors.joining(",","|","|"));   
    //System.out.println(name); |Monika,Joe,Bob,Alice|

   // Integer name = list.stream().collect(Collectors.summingInt(Person::getAge));
    //System.out.println(name); //132
    
  // Map<String,List<Person>> map = list.stream().collect(Collectors.groupingBy(Person::getCity));
  //  map.forEach((k,v) -> System.out.println(k + " -" + v));
  
    //Map<String,Integer> map = list.stream().collect(Collectors.groupingBy(Person::getCity,Collectors.summingInt(Person::getAge)));
    //map.forEach((k,v) -> System.out.println(k + " -" + v)); //Canada -36     London -64     Pune -32

   // Map<Boolean,List<Person>> map = list.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 18));
   // map.forEach((k,v) -> System.out.println(k + " -" + v));
   

   // Map<String,Set<String>> map =  list.stream()
                //.collect(Collectors.groupingBy(Person::getCity,Collectors.mapping(Person::getNeam, Collectors.toSet())));

   // map.forEach((k,v) -> System.out.println(k + " -" + v));


   // IntSummaryStatistics intSummaryStatistics =  list.stream()
           // .collect(Collectors.summarizingInt(Person::getAge));
   // System.out.println(intSummaryStatistics); IntSummaryStatistics{count=4, sum=73, min=16, average=18.250000, max=22}


    }
     
}
