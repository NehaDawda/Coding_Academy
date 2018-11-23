package com.neha;

public class InvalidRateException extends Exception {
    public static double MIN_RATE = 4;
    public static double MAX_RATE = 25;

    InvalidRateException(){
        super("Rate of Interest must be in range " + MIN_RATE + " to " +MAX_RATE);

    }
}
