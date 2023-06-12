package com.example.demo.java8.CollectorsExamples;

public class Person {

    String name;
    int age;
    String city;

    
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
    }

    
    
}
