package com.neha.hr;

import java.sql.*;

public class DepartmentDAO {


    public Department find(int dept_id){
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT department_id,department_name,manager_id,location_id from DEPARTMENTS WHERE department_ID = "+dept_id);

            if (rs.next()){
                int d_id = rs.getInt(1);
                String d_name = rs.getString(2);
                int mgr_id = rs.getInt(3);
                int loc_id = rs.getInt(4);

                Department dept = new Department(d_id,d_name,mgr_id,loc_id);
                return dept;
            }
            else{
                return null;
            }
        }catch (SQLException |ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
