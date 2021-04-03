package com.class25.overriding;

public class Parents {
    String name;
    Parents(String name){
        this.name=name;
    }
    void eat(){
        System.out.println(name+" like to eat rice");
    }
    void sleep(){
        System.out.println(name+" like to sleep at least 10 hour");
    }
}
