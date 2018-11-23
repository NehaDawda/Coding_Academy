package com.neha.app;

import com.neha.logic.Calculator;

public class Main {
    public static void main(String[] args){
        Calculator c = new Calculator();
        double k = c.doSum(12.02,55.5);
        System.out.println("Answer "+k);
    }
}
