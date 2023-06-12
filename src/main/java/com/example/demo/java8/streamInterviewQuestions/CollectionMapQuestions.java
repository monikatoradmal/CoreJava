package com.example.demo.java8.streamInterviewQuestions;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionMapQuestions {

    public static void main(String[] args) {

        List<Employee> empList = List.of(new Employee("Monika", 150000, "Pune"),
                                    new Employee("Bob", 200000, "London"),
                                    new Employee("Alice", 10000, "Newyork"),
                                    new Employee("Ram", 350000, "Delhi"),
                                    new Employee("Hari", 0, "Canada")
                                    );

        /*
         * convert List to Map(by default convrted to HashMap)
         * 
        */

        Function<Employee,String> fun = new Function<>(){

            @Override
            public String apply(Employee t) {
                return t.getName();                
            }         
            
        };

        

        Map<String,String> map = empList.stream()
                    .collect(Collectors.toMap(e -> fun.apply(e),Employee::getCity));
        System.out.println(map);
        

        Function<Map.Entry<String,String>,String> mapFun = new Function<>(){
            @Override
            public String apply(Map.Entry<String,String> entry){
                return entry.getKey();
            }
        };

        Map<String,String> sortedByKeyMap = map.entrySet().stream()
                   .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(entry -> mapFun.apply(entry), Map.Entry::getValue
                    ,(oldValue,newValue) -> oldValue,LinkedHashMap::new));
        System.out.println("Sorted Map with function :" + sortedByKeyMap); 



       /* Map<String,Double> sortedByTreeMap = map.entrySet().stream()
                    
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
                    ,(oldValue,newValue) -> oldValue,TreeMap::new));
        System.out.println("Tree Sorted Map :" + sortedByTreeMap); */

        
    }
    
}
