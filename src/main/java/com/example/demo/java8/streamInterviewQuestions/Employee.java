package com.example.demo.java8.streamInterviewQuestions;

public class Employee {

    String name;
    double salary;
    String city;

    
    public Employee(String name, double salary, String city) {
        this.name = name;
        this.salary = salary;
        this.city = city;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", city=" + city + "]";
    }

    
    
}
