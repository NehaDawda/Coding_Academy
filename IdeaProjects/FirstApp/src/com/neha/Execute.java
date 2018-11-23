package com.neha;

public class Execute {
    public static void main(String[] args){
        Dog maltese = new Dog();
        maltese.breed = "Maltese";
        maltese.size="Small";
        maltese.age=2;
        maltese.Color="White";
        System.out.print(maltese.getInfo());
    }
}
