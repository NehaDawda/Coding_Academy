package com.neha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num=13;
        boolean isPrime = true;

        for(int i=2;i< num/2;i++)
        {
            if(num%i==0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num + " is Prime");
        }
        else
        {
            System.out.println(num + " is not Prime");
        }
    }

    static void drawline(){
        for (int i=0;i<100;i++){
            System.out.print('-');
        }
    }

    static void drawline(int width){
        for(int i=0;i<width;i++){
            System.out.print('-');
        }

    }
}
