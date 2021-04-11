package com.class28.encapulation.demo;

public class Person {
   private String name;
    private String address;
    private String bankAccountNUmber;
    private String SSN;
    void setName(String name){
        if(name.length()<15){
            if(name.matches(("^[a-zA-Z]*$"))){
                this.name=name;
            }else {
                System.out.println("only character are allowed");
            }

        }else{
            System.out.println("More then 15 character is not allowed in name");
        }

    }
    String getName(){
        return name;
    }

}
