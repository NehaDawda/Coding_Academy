package com.neha;

public class InterestCalculator {
    protected double Principle;
    protected double Rate;
    protected int Duration;


    public InterestCalculator(){
        Principle = 0;
        Rate = 0;
        Duration = 0;
    }

    public InterestCalculator(double Amount, double rate, int Time){
        Principle = Amount;
        Rate = rate;
        Duration = Time;
    }
    public void setPrinciple(double Amount){
        Principle = Amount;
    }

    public void setRate(double rate){
        Rate = rate;
    }

    public  void setDuration(int Time){
        Duration = Time;
    }

    public double calculateInterest(){
        return (Principle * Rate/100 * Duration/12);
    }
}
