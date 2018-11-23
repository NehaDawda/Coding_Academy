package com.neha.hr;

import java.sql.*;

public class JDBCMain {
    public static void main(String[] args) {
        DepartmentDAO deptDAO = new DepartmentDAO();

        Department dept = deptDAO.find(30);
        System.out.println(dept);
    }
}
