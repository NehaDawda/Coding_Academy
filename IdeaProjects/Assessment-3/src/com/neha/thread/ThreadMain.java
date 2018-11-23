package com.neha.thread;

public class ThreadMain {

    public static void main(String[] args) {
	    //MyThread thread = new MyThread();
        Thread thread = new Thread(new MySysTime());
	    thread.start();
    }
}
