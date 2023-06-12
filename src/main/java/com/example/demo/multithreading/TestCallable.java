package com.example.demo.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

    public static void main(String[] args) throws Exception {


        ExecutorService executor = Executors.newFixedThreadPool(1);


        //Callable is a interface which has call method
        /*
         * interface Callable<T>{
         *      T call() throws Exception{
         *      }
         * }
         */
        Future<Integer> future  = executor.submit(new Callable<Integer>(){
 
                        public Integer call(){
                            return 20;
                        }
                        
                    });

        while(!future.isDone());
        //we can perform other task here

        System.out.println(future.get());
                    



        
    }
    
}
