package com.class24.demo2;

public class Car {
    String make;
    String model;
    void start(){
        System.out.println("key need to  start");
    }
    void stop(){
        System.out.println("It will stop when you apply break");
    }
     void park(){
         System.out.println("Park manually");
     }
}
class BMW extends Car{
    void start(){
        System.out.println("key less start by pushing bottom");
    }
    void drifting(){
        System.out.println("can drift");
    }
}
class Tesla extends Car{
    void start(){
        System.out.println("key less start by pushing bottom");
    }
    void park(){
        System.out.println("Park auto");
    }
}
class Toyota extends Car{

}