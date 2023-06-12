package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class MainTest {  
    UnitTest test = new UnitTest();

    @Test
    public void test(){
        String s = test.testUnit();
       assertEquals("Hello", s);  
   }

    @Test
    public void test2(){
        String s = test.testUnit("He");
        assertEquals("Hello", s);  
    }
    
}
