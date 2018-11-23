package com.neha;

public abstract class Account {
    protected int accNo;
    protected String custName;
    protected double balance;

    public Account(int accNo,String Name,double amount){
        this.accNo = accNo;
        custName = Name;
        balance = amount;
    }

    public void deposit(double amount){
        System.out.println("Current Balance: "+balance);
        balance+=amount;
        System.out.println("Deposit Completed!");
        System.out.println("Updated Balance: "+balance);
    }

    public void withdraw(double amount){
        if(balance>amount){
            System.out.println("Current Balance: " +balance);
            balance-=amount;
            System.out.println("Withdrawal Done!");
            System.out.println("Updated Balance: "+balance);
        }
        else{
            System.out.println("Insufficient balance!!!");
        }
    }
}
