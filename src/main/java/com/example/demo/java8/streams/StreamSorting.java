package com.example.demo.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {

    public static void main(String[] args) {
        List<String> list = List.of("D","g","2","s");
        int[] arr = {4,6,8,1};
       // Arrays.stream(arr).sorted().forEach(System.out::println);
        //natural sorting order
        List<String> sortedList = list.stream().sorted()
                                                .collect(Collectors.toList());
       // System.out.println(sortedList);
       //sortedList.forEach(System.out::println);

       //reverse order
       List<String> reverseList = list.stream()
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList());
      // reverseList.forEach(System.out::println);

       List<Employee> empList = List.of(new Employee("Monika",32,150000),
       new Employee("Sonali",34,180000),
       new Employee("John",50,450000),
       new Employee("David",39,350000),
       new Employee("Parker",22,50000)     
       );

       //Sort employee with name
       Comparator<Employee> withnameReversed = Comparator.comparing(Employee::getName,(s1,s2) -> {
        return s2.compareTo(s1);
       });
       Comparator<Employee> withAge = Comparator.comparing(Employee::getAge);
       //empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
       empList.stream().sorted(Comparator.comparing(Employee::getName, (s1,s2) -> {
        return s2.compareTo(s1);
       })).forEach(System.out::println);
       //empList.stream().sorted(withAge).forEach(System.out::println);

       List<Person> personList = List.of(new Person("Monika",Gender.FEMALE,32),
       new Person("Deepu",Gender.MALE,34),
       new Person("Moni",Gender.FEMALE,30),
       new Person("Deepak",Gender.MALE,33));

      // personList.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);
        
      List<Person> personListwithnull = Arrays.asList(new Person("Monika",Gender.FEMALE,32),
       new Person("Deepu",Gender.MALE,34),null,
       new Person("Moni",Gender.FEMALE,30),null,
       new Person("Deepak",Gender.MALE,33));

       personListwithnull.stream().sorted
                                (Comparator.nullsLast(Comparator.comparing(Person::getName)))
                                .forEach(System.out::println);

     /*  personListwithnull.stream().sorted
                                (Comparator.nullsLast(Comparator.comparing(Person::getName)))
                                .forEach(System.out::println);  */
    }
    
}
