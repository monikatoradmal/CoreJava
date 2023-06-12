package com.example.demo.logical;

public class MaxElementArray {

    public static void main(String[] args) {
        int[] arr ={100,45,101,2000,67,3,89,190};
        new MaxElementArray().findMax(arr);

    }

    private void findMax(int[] arr) {
        int largeElement = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            //System.out.println(i);
            if(arr[i] > largeElement){
                largeElement = arr[i];
            }
        }

        System.out.println(largeElement);
    }
    
}
