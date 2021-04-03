package com.class18;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account= new Account();
        Scanner scanner=new Scanner(System.in);



        while(true){
            System.out.println("Enter 1 for signup 2 for login 3 for transfer n 4 for exit");
            int input = scanner.nextInt();

            if(input==4){
                break;
            }else if(input==3){
                System.out.println("Enter the amount that you want too transfer");
                double amount = scanner.nextDouble();
                System.out.println("please renter your password");
                String pass=scanner.next();
                account.transferFund(pass,amount);
            }else if(input ==2){
                System.out.println("Welcome to our bank please enter your username and password");
                String username=scanner.next();
                String password=scanner.next();
                account.login(username,password);
            }else if(input==1){
                System.out.println("Enter your userName password and the Amount that you want to deposit");
                account.signUp(scanner.next(),scanner.next(),scanner.nextDouble());
            }
        }

    }
}
