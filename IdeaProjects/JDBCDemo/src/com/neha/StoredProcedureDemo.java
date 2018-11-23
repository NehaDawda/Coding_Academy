package com.neha;

import java.sql.*;
import java.util.Scanner;

public class StoredProcedureDemo {
    public static void main(String[] args) {
        Connection con = null;
        CallableStatement stmt = null;

        //read User Inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Employee ID(int):");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter Employee Name:");
        String name = input.nextLine();
        System.out.println("Enter Employee Role");
        String role = input.nextLine();
        System.out.println("Enter Employee City");
        String city = input.nextLine();
        System.out.println("Enter Employee Country");
        String country = input.nextLine();

        try{
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
            stmt = con.prepareCall("{call insertEmployee(?,?,?,?,?,?)}");
            stmt.setInt(1,id);
            stmt.setString(2, name);
            stmt.setString(3, role);
            stmt.setString(4,city);
            stmt.setString(5,country);
            stmt.registerOutParameter(6,java.sql.Types.VARCHAR);

            stmt.executeUpdate();

            String result = stmt.getString(6);
            System.out.println("Employee Record Save Sucess::" + result);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                stmt.close();
                con.close();
                input.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

}
