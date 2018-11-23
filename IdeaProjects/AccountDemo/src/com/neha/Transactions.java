package com.neha;

public class Transactions {
    public void transfer(Account source, Account target, double amount){
        if(source.balance > amount){
          source.withdraw(amount);
          target.deposit(amount);
          System.out.println("Trasfer Done!!");
        }
        else{
            System.out.println("Insufficient Balance!!!");
        }
    }
    public void payBill(Account a, String Biller, double amount){
        if(a.balance > amount){
            a.withdraw(amount);
            System.out.println("Bill Payment to "+Biller+" of amount"+amount+" is done.");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
