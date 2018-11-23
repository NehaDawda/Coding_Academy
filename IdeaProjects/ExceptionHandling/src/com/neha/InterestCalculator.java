package com.neha;

public class InterestCalculator {
    static void calc(double p, double r, int d) throws InvalidPrincipleException,InvalidRateException,InvalidDurationException{

        if(p<InvalidPrincipleException.MIN_PRINCIPLE || p>InvalidPrincipleException.MAX_PRINCIPLE)
            throw new InvalidPrincipleException();

        if(r<InvalidRateException.MIN_RATE|| r>InvalidRateException.MAX_RATE)
            throw new InvalidRateException();

        if(d<InvalidDurationException.MIN_DURATION || d>InvalidDurationException.MAX_DURATION)
            throw new InvalidDurationException();

        double interest = p*r/100/12*d;
        System.out.println("Interest:" +interest);
    }
}
