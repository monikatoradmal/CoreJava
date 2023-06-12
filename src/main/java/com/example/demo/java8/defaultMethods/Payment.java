package com.example.demo.java8.defaultMethods;

public interface Payment {

    default void doPaymentbyCash(){
        System.out.println("Cash accepted for payment");
        
    }

    static void doPaymentbyCard(){
        System.out.println("Card accepted");
        
    }
    
}
