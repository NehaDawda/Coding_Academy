package com.neha;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));

        Properties ps = new Properties();
        try {
            ps.load(Main.class.getResourceAsStream("/app.properties"));
            System.out.println("DB Name: "+ps.getProperty("db.name"));
            System.out.println("Student Passing Score: "+ps.getProperty("student.passing-score"));

            ps.setProperty("db.port","1257");
            ps.store(new FileOutputStream("app.properties"),"added property");

        }catch (IOException ex){
            System.out.println("Unable to load the properties");
            ex.printStackTrace();
        }
        }
}
