package com.neha;

public class InvalidDurationException extends Exception {
    public static int MIN_DURATION = 12;
    public static int MAX_DURATION = 240;

    InvalidDurationException(){
        super("Rate of Interest must be in range " + MIN_DURATION + " to " +MAX_DURATION);

    }
}
