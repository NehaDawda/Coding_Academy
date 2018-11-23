package com.neha;

//Class for Question-3
public class User {
    private String userName;
    private String password;
    private String role;
    private boolean active;

    public User(String userName, String password, String role, boolean active) {
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.active = active;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return ("{username: " + userName + " role: " + role + " active: " + active + "}" );
    }

    public boolean validatePassword(String pwd){

        return getPassword().contentEquals(pwd);
    }
}
