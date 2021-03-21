package com.class13;

public class Account {
    String username;
    String password;
    double balance;
    long AccountNumber;
    boolean isLoggedIn;
    public void login(String PassedUserNameWhenLogging,String PassedPasswordWhenLogging){
        if(username.equals(PassedUserNameWhenLogging)&&password.equals(PassedPasswordWhenLogging)){
            System.out.println("Welcome to bank of america your balance is "+balance);
        }else{
            System.out.println("User name and password incorrect");
        }
    }

    public void printInfo(){
    if(isLoggedIn){
        System.out.println("Your account number is"+ AccountNumber+ "your balance is "+balance);
    }
}
}
//I need to learn how to type fast