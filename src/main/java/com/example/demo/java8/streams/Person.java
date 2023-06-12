package com.example.demo.java8.streams;

public class Person {

    private String name;
    private Gender gender;
    private int age;

    
    public Person(String name,Gender gender,int age){
        this.name= name;
        this.gender=gender;
        this.age=age;

    }


    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
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


    @Override
    public String toString() {
        return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
    }

    
}
