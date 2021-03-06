package com.neha.hr;

import java.time.LocalDateTime;

public class Department {
    private int dept_id;
    private String dept_name;
    private int manager_id;
    private int location_id;

    public Department(int dept_id, String dept_name, int manager_id, int location_id) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.manager_id = manager_id;
        this.location_id = location_id;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public int getManagerId() {
        return manager_id;
    }

    public void setManager(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getLocation() {
        return location_id;
    }

    public void setLocation(int location_id) {
        this.location_id = location_id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", manager=" + manager_id +
                ", location=" + location_id +
                '}';
    }
}
