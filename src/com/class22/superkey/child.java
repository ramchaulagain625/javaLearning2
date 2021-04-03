package com.class22.superkey;

public class child extends parent {
    String color = "Red";

    void printColor(){
        System.out.println("Child class "+this.color);
        System.out.println("parent class "+super.color);
    }
    void print5times(boolean shouldcallParent){
        if(shouldcallParent){
            super.printColor();
        }else{
            this.printColor();
        }

    }

}
