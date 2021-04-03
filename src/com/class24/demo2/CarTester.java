package com.class24.demo2;

public class CarTester {
    public static void main(String[] args) {
     Car bmw = new BMW();
     bmw.start();// method from child will be called because we have overridden
     bmw.stop();
     //bmw.drifting();// not allowed to call child types object from parent reference
        BMW bmw1=(BMW)bmw;
        bmw1.drifting();
        Car car = new Tesla();
        BMW bmw2=(BMW) car;


    }
}
