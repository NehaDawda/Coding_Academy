package com.neha;

import java.util.*;

//Class for Question-4
public class UserManager {
    private HashMap<String,User> userList;

    public UserManager() {
        userList = new HashMap<> ();
    }

    public void add(User user){
        userList.put(user.getUserName(),user);
        System.out.println("User added!!!");
    }

    public HashMap<String, User> getAll(){
        return userList;
    }

    public User find(String name){
        User foundUser;


        Set set = userList.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry temp = (Map.Entry) it.next();
            User temp1 = (User) temp.getValue();
            if(temp1.getUserName().toLowerCase().contentEquals(name.toLowerCase())){
                return temp1;
            }
        }
        return null;
    }


}
