package com.class15;

import java.util.Scanner;

public class class15cw {
    String username;
    String password;

    public static void main(String[] args) {
       class15cw cw = new class15cw();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your user name");
        cw.username=sc.next();
        System.out.println("Please enter your password");
        cw.password=sc.next();
        if(cw.username.length()==0&&cw.password.length()==0){
            System.out.println("User name and password must have some value");
        }
            if(cw.password.length()<8||cw.password.contains(cw.username)){
            System.out.println("Password must be at least 8digit long and must not contain user name");
        }
            if(cw.username.equalsIgnoreCase("ramchaulagain")&&cw.password.equalsIgnoreCase("abcd123")){
                System.out.println("Sucessfully login");
            }else {
                System.out.println("incorrect password");
            }
    }
}
