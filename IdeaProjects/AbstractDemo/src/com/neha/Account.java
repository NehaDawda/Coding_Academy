package com.neha;

public abstract class Account {
    protected int accountNo;
    protected String accountHolder;
    protected double balance;

    Account(int accNo, String Name, double bal){
        accountNo = accNo;
        accountHolder = Name;
        balance = bal;
    }
    public double getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

}
