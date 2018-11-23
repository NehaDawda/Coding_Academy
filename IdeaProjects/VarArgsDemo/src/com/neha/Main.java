package com.neha;

public class Main {
    static int doSum(int ... data){
        int sum=0;
        for (int i=0;i<data.length;i++){
            sum+=data[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum:"+doSum());
    }
}
