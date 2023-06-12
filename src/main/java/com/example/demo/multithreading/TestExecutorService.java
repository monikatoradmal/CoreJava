package com.example.demo.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {

    public static void main (String[] args){  
        
        
        /*with this thread pool of 5 threads will get create and will execute 8 tasks...no need of
        creating thread for each task*/
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Task());  //Task1
        executorService.execute(new Task());  //Task2
        executorService.execute(new Task());  //Task3
        executorService.execute(new Task());  //Task4
        executorService.execute(new Task());  //Task5
        executorService.execute(new Task());  //Task6
        executorService.execute(new Task());  //Task7
        executorService.execute(new Task());  //Task8

    }
    
}
