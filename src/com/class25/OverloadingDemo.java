package com.class25;

public class OverloadingDemo {
    void printInfo(String name){
        System.out.println("Name "+name);
    }
    void printInfo(String name,String address){
        System.out.println("Name "+name+"Address "+address);
    }
    void printInfo(String name,String address,int number){
        System.out.println("Name "+name+"Address "+address+" phone No "+number);
    }
}
