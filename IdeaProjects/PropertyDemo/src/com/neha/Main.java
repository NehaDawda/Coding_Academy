package com.neha;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties ps = new Properties();
        try {
            ps.load(Main.class.getResourceAsStream("/db.properties"));
            System.out.println("DB Driver: "+ps.getProperty("db.driver"));
            System.out.println("DB Name: "+ps.getProperty("db.name"));
            System.out.println("DB User: "+ps.getProperty("db.user"));
            System.out.println("DB Password: "+ps.getProperty("db.password"));
            System.out.println("DB URL: "+ps.getProperty("db.url"));

        }catch (IOException ex){
            System.out.println("Unable to load the properties");
            ex.printStackTrace();
        }
    }
}
