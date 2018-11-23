package com.neha;

public class Main1 {
    public static void main(String[] args) {
        try {
            InterestCalculator.calc(230000, 4.5, 3);
        }catch(Exception ex){
            System.out.println("Something went wrong:"+ex.getMessage());
        }
    }
}
