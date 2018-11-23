package com.neha;

public class InvalidPrincipleException extends Exception {
    public static double MIN_PRINCIPLE = 10000;
    public static double MAX_PRINCIPLE = 10000000;

    InvalidPrincipleException(){
        super("Principle amount must be in range " + MIN_PRINCIPLE + " to " + MAX_PRINCIPLE);
    }
}
