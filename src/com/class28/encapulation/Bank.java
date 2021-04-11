package com.class28.encapulation;

class BankAccount {
   private  String name;
    private String userName;
    private String password;
    private  double balance;

    public BankAccount(String name,String userName,String password,double balance){
        this.name= name;
        this.userName=userName;
        this.password=password;
        this.balance= balance;
    }
    public void setName(String name){
        if(name.matches(("^[a-zA-Z]*$"))){
            this.name=name;
        }else {
            System.out.println("Character are not allowed");
        }
    }
    double getBalance(String userName,String password){
        if ((this.userName.equals(userName)) && (this.password.equals(password))){
            return balance;
        } else {
            return 0;
        }
    }
    public void login(String userName,String password){
       if ((this.userName.equals(userName)) && (this.password.equals(password))){
           System.out.println("Welcome to bank");
        } else {
           System.out.println("Please check your username and password");
       }


        }
    }

