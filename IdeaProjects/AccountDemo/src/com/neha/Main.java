package com.neha;

public class Main {

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(12345,"Neha Dawda",100000);
        CurrentAccount ca = new CurrentAccount(123456, "Neha1 Dawda", 20000);

        sa.deposit(10000);
        sa.withdraw(5000);

        ca.deposit(1000);
        ca.withdraw(10000);

        Transactions t = new Transactions();

        t.transfer(sa,ca, 15000);
        t.payBill(sa,"Airtel",1000);
    }
}
