package com.example.demo.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class ToArrayMethod {

    public static void main(String[] args) {
        List<Integer> list = List.of(1234,12345,12,234567);

    Integer[] s1 = list.stream()
                    .filter(s -> String.valueOf(s).length()>=4)
                    .toArray(Integer[]::new);
   //System.out.println(Arrays.toString(s1));

    List<Person> personList = List.of(new Person("Monika",Gender.FEMALE,32),
    new Person("Deepu",Gender.MALE,34),
    new Person("Moni",Gender.FEMALE,30),
    new Person("Deepak",Gender.MALE,33));

    IntFunction<Person[]> function = new IntFunction<>() {

        @Override
        public Person[] apply(int value) {
            System.out.println("Value is" + value);
          return new Person[value];
            
        }
        
    };
    Person[] personArr = personList.stream()
              .filter(p -> p.getGender() == Gender.MALE).toArray(function);
              //.filter(p -> p.getGender() == Gender.MALE.toArray(Person[]::new);
    
    System.out.println(Arrays.toString(personArr));
    
    List<Course> courses= List.of(
            new Course("Java",98,12000),
            new Course("Spring",89,100),
            new Course("Spring Boot",100,15000),
            new Course("Spring MVC",900,9000),
            new Course("DB",7000,7000)
        );
        

        Course[] arr = courses.stream().toArray(Course[]::new);

       // System.out.println(Arrays.toString(arr));
    


    
    }
    
    
}
