package com.neha.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MySysTime implements Runnable {
    private LocalDateTime now;

    public MySysTime(){
        now = LocalDateTime.now();
    }

    @Override
    public void run() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        while(true){
            try{
                now=LocalDateTime.now();
                System.out.println(dtf.format(now));
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
