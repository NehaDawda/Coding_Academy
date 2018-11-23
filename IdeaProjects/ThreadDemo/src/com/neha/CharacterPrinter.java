package com.neha;

public class CharacterPrinter implements Runnable{
    private String statement;

    public CharacterPrinter(String statement) {
        this.statement = statement;
    }

    public void run() {
        for(int i=0;i<statement.length();i++){
            System.out.print(" " + statement.charAt(i));
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
