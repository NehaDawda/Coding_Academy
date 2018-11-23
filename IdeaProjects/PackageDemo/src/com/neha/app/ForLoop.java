package com.neha.app;

public class ForLoop {
    public static void main(String[] args){
        int nums[] = {10,20,33,23,56};

        for(int i=0;i<nums.length;i++){
            System.out.println("Number:"+nums[i]);
        }

        System.out.println("Enhanced FOR /For Each");
        //Get ONE value of type INT from array "nums'
        //LOOP terminates after LAST element
        for(int x: nums){
            System.out.println("Number:"+x);
        }
    }
}
