package com.neha;


//Class for Question-2
public class CredentialsValidations {

    public static void ValidateUserName(String name) throws IllegalCredentialsException{
        //checking for username minimum length
        if(name.length()<6 ){
            throw (new IllegalCredentialsException("username must contain atleast 6 characters"));
        }

        //checking for username maximum length
        if(name.length() >12){
            throw (new IllegalCredentialsException("username must not contain more than 12 characters"));
        }

        //checking for space in username
        char[] chars = name.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(Character.isSpaceChar(chars[i])){
                throw (new IllegalCredentialsException("username cannot contain a space"));
            }
        }
    }

    public static void ValidatePassword(String pwd) throws IllegalCredentialsException{
        //checking for password minimum length
        if(pwd.length()<8 ){
            throw (new IllegalCredentialsException("password must be minimum 8 characters long"));
        }

        //checking: password must contain 1 digit
        {
            char[] chars = pwd.toCharArray();
            boolean hasDigit = false;
            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(chars[i])) {
                    hasDigit = true;
                    break;
                }
            }
            if (!(hasDigit)) {
                throw (new IllegalCredentialsException("password must conatain atleast one digit"));
            }
        }

        //checking: password must contain 1 special character
        {
            char[] chars = pwd.toCharArray();
            boolean hasSpecialChar = false;
            for (int i = 0; i < chars.length; i++) {
                if (!(Character.isLetterOrDigit(chars[i]))) {
                    hasSpecialChar = true;
                    break;
                }
            }
            if (!(hasSpecialChar)) {
                throw (new IllegalCredentialsException("password must conatain atleast one special charater"));
            }
        }
    }
}
