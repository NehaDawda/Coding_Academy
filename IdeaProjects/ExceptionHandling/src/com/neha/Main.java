package com.neha;

public class Main {

    public static void main(String[] args) {
	    try{
	        int k = 100/2;
	        int data[] = new int[1];
	        data[2] =k;
            System.out.println("Answer: " +k);
        }catch(ArithmeticException ex){
	        System.out.println(ex.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("End if MAIN");
    }
}
