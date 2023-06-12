package com.example.demo.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class streamReduce1 {

    public static void main(String[] args) {

        List<Employee> emplist = List.of(
        new Employee("Monika", 32, 50000,"IT"),
        new Employee("Deepak", 34, 20000,"IT"),
        new Employee("Moni", 30, 10000,"Comp"),
        new Employee("Soni", 32, 70000,"Comp")        
    );


    emplist.stream()
            .reduce(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))
            .ifPresentOrElse(emp -> {System.out.println(emp);}, () -> {System.out.println("Max value not present");});
            //Soni:32:70000.0
////////////////////////////////////////////////////////////////////////////

            List<Employee> emp = List.of(
                new Employee("Monika", 32, 50000,"IT"),
                new Employee("Deepak", 34, 20000,"IT"),
                new Employee("Moni", 30, 10000,"Comp"),
                new Employee("Soni", 32, 70000,"Comp")        
            );


        Employee e=emp.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(e);  //Soni:32:70000.0
//////////////////////////////////////////////////////////////////////////////////////////////////////        
    

    List<Employee> empgroupby = List.of(
                new Employee("Monika", 32, 50000,"IT"),
                new Employee("Deepak", 34, 20000,"IT"),
                new Employee("Moni", 30, 10000,"Comp"),
                new Employee("Soni", 32, 70000,"Comp")        
            );

    Map<String,Optional<Employee>> map = empgroupby.stream().
            collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

    map.forEach((k,v) -> System.out.println(k + "-" +v));
    /*
     * IT-Optional[Monika:32:50000.0]
       Comp-Optional[Soni:32:70000.0]  
     * 
     * 
     */

    List<Integer> numbers = List.of(10,90,100,150,30,1,45); 
   Integer i = numbers.stream().max(Comparator.naturalOrder()).get();
   System.out.println("Max element is " + i);
   
   //second largest element
    Integer i1 = numbers.stream()
    .sorted(Comparator.reverseOrder())
    .skip(1)
    .limit(1)
    .findFirst().get();
    System.out.println("Second Max element is " + i1);
    

    }
    
}
