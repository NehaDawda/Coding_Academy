package com.neha;

import com.neha.Display;
import com.neha.Storage;
import com.neha.Computer;

public class Main {

    public static void main(String[] args) {
	    HardDisk HD = new HardDisk();
	    Moniter moniter = new Moniter();

	    Computer C = new Computer(HD,moniter);
    }
}
