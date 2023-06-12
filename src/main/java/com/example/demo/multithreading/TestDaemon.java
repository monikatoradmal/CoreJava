package com.example.demo.multithreading;

public class TestDaemon {
    
    public static void main (String[] args){


        Thread thread = new Thread(new Task());
        thread.setDaemon(true);
        thread.start();

        int i;
        for(i=1;i<=5;i++){
            System.out.println("Executing main" + i);
        }

        /*

         * as custom thread is daemon, it executed till main thread was executing 
         * 
         *  Executing main1
            Executing Task0
            Executing main2
            Executing main3
            Executing Task1
            Executing Task2
            Executing main4
            Executing main5
            Executing Task3
            Executing Task4
            Executing Task5
            Executing Task6
         * 
         */

    }
}
