package com.example.demo.java8.streams;

import java.util.List;

public class Employee {

    private String name;
    private Integer age;
    private double salary;
    private List<String> cities;
    private String department;
    private List<Double> numbers;
    

    public Employee(String name,List<Double> numbers){
        this.name = name;
        this.numbers=numbers;
}

    public Employee(String name,Integer age,double salary){
            this.name = name;
            this.age=age;
            this.salary=salary;
    }
    
    public Employee(String name,Integer age,double salary,String department){
        this.name = name;
        this.age=age;
        this.salary=salary;
        this.department = department;
}
    public Employee(String name,Integer age,double salary,List<String> cities){
        this.name = name;
        this.age=age;
        this.salary=salary;
        this.cities=cities;
}


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
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

    @Override
    public String toString() {
        return name+":" + age+":" + salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        return true;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Double> numbers) {
        this.numbers = numbers;
    }
    
}
