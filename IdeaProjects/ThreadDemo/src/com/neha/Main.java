package com.neha;

public class Main {

    public static void main(String[] args) {
	    CharacterPrinter printer = new CharacterPrinter("The quick brown fox jumps over the lazy dog");
	    CharacterPrinter printer2 = new CharacterPrinter("123456789101112131415");

	    Thread t1 = new Thread(printer);
	    Thread t2 = new Thread(printer2);

	    t1.start();
	    t2.start();
    }
}