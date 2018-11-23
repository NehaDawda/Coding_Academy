package com.neha;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\web");
            if(file.exists()){
                System.out.println("It does Exists!");
            }
            if(file.isDirectory()){
                System.out.println("Its a directory!");
            }
            else{
                System.out.println("Its not a directory!");
            }

            File newfile = new File(file,"data.txt");
            if(newfile.exists()){
                System.out.println("File already exsits!");
            }
            else{
                System.out.println("Creating a new one");
                newfile.createNewFile();
            }

        }catch (IOException ex){
            System.out.println("Unable to create!");
            System.out.println(ex.getMessage());
        }
    }
}
