package com.example.demo.multithreading;

public class TestThreadGroup {

    public static void main(String[] args){

        System.out.println(Thread.currentThread()); //Thread[main,5,main] [threadname,priority,threadgroup]


        //Get its parent threads - default thread
        Thread thread = Thread.currentThread();

        
        //associate custom thread with thread group

        ThreadGroup gp = new ThreadGroup("CustomGroup");
        Thread customThread = new Thread(gp,new Task(),"CustomThread"); //pass threadgroup, runnable,threadname
        //customThread.start();
      

        ThreadGroup group = thread.getThreadGroup();
        while(group.getParent() != null){
            group = group.getParent();
        }

        group.list();
        /*
         * java.lang.ThreadGroup[name=system,maxpri=10]
            Thread[Reference Handler,10,system]
            Thread[Finalizer,8,system]
            Thread[Signal Dispatcher,9,system]
            Thread[Attach Listener,5,system]
            java.lang.ThreadGroup[name=main,maxpri=10]
                Thread[main,5,main]
            java.lang.ThreadGroup[name=InnocuousThreadGroup,maxpri=10]
            Thread[Common-Cleaner,8,InnocuousThreadGroup]
         * 
         */

        

    }
    
}
