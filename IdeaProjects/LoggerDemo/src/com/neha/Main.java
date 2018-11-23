package com.neha;

import org.apache.log4j.*;

public class Main {

    static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        log.info("Info Message");
        log.debug("Debug Message");
        log.error("Error Message");
        log.fatal("Exception Occurred",new RuntimeException("Dummy"));
        // write your code here
    }
}
