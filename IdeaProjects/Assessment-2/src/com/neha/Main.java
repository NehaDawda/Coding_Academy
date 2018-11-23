package com.neha;

import java.util.*;

//Class for Question-5
public class Main {

    private static UserManager userManager = new UserManager();

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        String  name="",pwd="";

        try {
            System.out.print("Please Enter username: ");
            name = scanner.nextLine();

            CredentialsValidations.ValidateUserName(name);
            User temp = userManager.find(name);

            if(temp == null){
                System.out.println("Duplicate username can't be added");
            }
            else{
                System.out.print("Please Enter password: ");
                pwd = scanner.nextLine();

                CredentialsValidations.ValidatePassword(pwd);

                System.out.print("Please enter role:");
                String role = scanner.nextLine();

                System.out.print("Is user active (Y/N): ");
                String active = scanner.nextLine();
                boolean isActive;
                if(active == "Y"){
                    isActive = true;
                }
                else{
                    isActive = false;
                }

                User user = new User(name,pwd,role,isActive);
                userManager.add(user);
            }

        }catch(IllegalCredentialsException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        User user = new User("Ashish","pass@12245","Admin",true);
        userManager.add(user);

        user = new User("Anish","My$pass123","User",true);
        userManager.add(user);

        user = new User("Alok","$$xyz$$12345","User",true);
        userManager.add(user);

        user = new User("Aditi","Opps_forgot_1","User",true);
        userManager.add(user);

        System.out.print("Enter Username: ");
        String username = scanner.next();

        User u = userManager.find(username);
        if(u == null){
            System.out.println("Username not found!!!");
        }
        else{
            System.out.print("Enter Password: ");
            String pwd = scanner.next();

            boolean validPwd = u.validatePassword(pwd);
            if(validPwd){

                System.out.println("Login Successful");

                int choice = 0;
                do{
                    System.out.println("Select Options:");
                    System.out.println("1. Add User");
                    System.out.println("2. Find User");
                    System.out.println("3. Get All Users");
                    System.out.println("4. Exit");
                    choice = scanner.nextInt();
                    switch (choice){
                        case 1:{
                            add();
                            break;
                        }
                        case 2:{
                            System.out.println("Please enter username to find");
                            String name = scanner.next();
                            User foundUser = userManager.find(name);
                            if(foundUser == null) {
                                System.out.println("User not found!!!");
                            }
                            else {
                                System.out.println(foundUser.toString());
                            }
                            break;
                        }
                        case 3:{
                            HashMap<String, User> users = userManager.getAll();
                            Set set = users.entrySet();
                            Iterator it = set.iterator();
                            System.out.println("Total "+ users.size() + " users found!!!");
                            while(it.hasNext()){
                                System.out.println(it.next());
                            }
                            break;
                        }
                        case 4:{
                            System.out.println("Exit Successfully");
                            break;
                        }
                        default:{
                            System.out.println("Please select correct options!!!");
                            break;
                        }
                    }

                }while(choice !=4);
            }
            else{
                System.out.println("Incorrect Password");
            }
        }
    }
}