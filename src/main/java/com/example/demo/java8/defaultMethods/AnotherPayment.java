package com.example.demo.java8.defaultMethods;

public interface AnotherPayment extends Payment {
    
   // void doPaymentbyCash();
   default void doPaymentbyCash(){
    System.out.println("Cash accepted for another payment.Imdiate super");
    
}
}
