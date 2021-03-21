package com.class13;

public class BankApplication {
    public static void main(String[] args) {
        Account ram =new Account();
        ram.AccountNumber=12345;
        ram.balance=12345;
        ram.username="ramsdc";
        ram.password="ram123";
        ram.isLoggedIn=true;
        ram.login("ramsdc","ram123");
    }
}
