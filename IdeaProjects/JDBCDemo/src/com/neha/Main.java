package com.neha;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class Main {

    /**
     * Test Database connectivity with JDBC
     * @param args
     */
    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        //Step 1: Load JDBC Driver
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("JDBC Driver found and Loaded!");
        }catch(ClassNotFoundException ce){
            System.out.println("Cannot load driver "+ce.getMessage());
            return; //Close main method
        }

        //Step 2: Create a connection
        try{
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:oracle:thin:@localhost:1521/orcl");
            rowSet.setUsername("hr");
            rowSet.setPassword("hr");
            rowSet.setCommand("SELECT first_name, last_name FROM employees");
            rowSet.execute();

            while(rowSet.next()){
                String fname = rowSet.getString(1);
                String lname = rowSet.getString(2);
                System.out.println("Name : "+fname+" "+lname);
            }

        }catch(SQLException ex){
            System.out.println("Unable to connect: "+ex.getMessage());
            return;
        }
    }
}