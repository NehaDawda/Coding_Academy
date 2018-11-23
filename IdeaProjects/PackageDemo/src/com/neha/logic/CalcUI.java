package com.neha.logic;

public class CalcUI {
    public static void main(String[] args){
        //c is ref variable
        //'new' instruct JVM to build new object of type 'Calculator' class
        //then store itd reference to variablr 'c'
        Calculator c = new Calculator();
        c.doSum(12.9,99.1);
    }
}
