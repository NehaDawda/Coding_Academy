package com.neha.app;

import com.neha.logic.Account;

public class ObjectDemo {
    public static void main(String[] args){
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = a1;

        System.out.println("HashCode for a1: "+a1.hashCode());
        System.out.println("HashCode for a2: "+a2.hashCode());
        System.out.println("HashCode for a3: "+a3.hashCode());

        System.out.println("ToString for a1: "+a1.toString());
        System.out.println("ToString for a2: "+a2.toString());
        System.out.println("ToString for a3: "+a3.toString());

    }
}
