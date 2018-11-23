package com.neha;

public class CompoundInterestCalculator extends InterestCalculator {

    private int NumberOfTimeInterestCompounded;

    public CompoundInterestCalculator(){
        super();
        NumberOfTimeInterestCompounded = 0;
    }

    public CompoundInterestCalculator(double Amount, double rate, int Time, int num){

        super(Amount,rate,Time);
        NumberOfTimeInterestCompounded = num;
    }


    public void setNumberOfTimeInterestCompounded(int num){
        NumberOfTimeInterestCompounded = num;
    }

    public void setPrinciple(int Amount){
        super.Principle = Amount;
    }

    public void setRate(float rate){
        super.Rate = rate;
    }

    public void setDuration(int Time){
        super.Duration = Time;
    }

    public double CalculateInterest(){
        return (super.Principle*(1+ Math.pow(super.Rate/(100*NumberOfTimeInterestCompounded),(double)super.Duration*NumberOfTimeInterestCompounded)));
    }
}
