package com.neha;

public class Main {

    public static void main(String[] args) {
        InterestCalculator IC = new InterestCalculator(10000,8,60);

        System.out.println("Simple Interest is: "+IC.calculateInterest());

        CompoundInterestCalculator CIC = new CompoundInterestCalculator(5000, 5, 10,12);

      System.out.println("Compound Interest is: "+CIC.CalculateInterest());

    }


}
