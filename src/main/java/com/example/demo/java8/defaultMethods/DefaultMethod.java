package com.example.demo.java8.defaultMethods;

public class DefaultMethod implements Payment,AnotherPayment{
    
    
    public static void main(String[] args) {

    Payment.doPaymentbyCard();
    Payment p = new DefaultMethod();
    p.doPaymentbyCash();
    
    }
        
        
    
        
    }
    

