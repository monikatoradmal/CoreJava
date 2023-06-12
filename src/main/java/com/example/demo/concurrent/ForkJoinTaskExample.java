package com.example.demo.concurrent;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTaskExample {

    public static void main(String[] args) {

        int arr[] = {4,5,7,8,12,34,2,67,34,23,4,23,4};
        int start=0;
        int end = arr.length-1;
        int searchElement = 4;

        ForkJoinPool pool = ForkJoinPool.commonPool();
        Task task = new Task(arr,start,end,searchElement);
        int result = pool.invoke(task);

        System.out.println("Count of element" + result);
        
    }
    
}

class Task extends RecursiveTask<Integer>{

    int arr[];
    int start,end;
    int searchElement;


    public Task(int[] arr, int start,int end,int searchElement){
       this.arr= arr;
       this.start= start;
       this.end=end;
       this.searchElement=searchElement;

    }

    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread());
        int size = end-start +1;
        if(size > 3){
            int mid = (end +start) /2;
            Task task1 = new Task(arr,start,mid,searchElement);
            Task task2 = new Task(arr,mid+1,end,searchElement);

            task1.fork();
            task2.fork();

            return task1.join() + task2.join();

        }else{
            
        return findElement();
        }

    }   

    private Integer findElement(){
       int count = 0;
        for(int i=start;i<=end;i++){
            if(arr[i] ==searchElement){
                count++;
            }
        }
        return count;
    }
}

