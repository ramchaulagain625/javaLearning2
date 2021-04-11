package com.class28.demo;

public class demo implements I1,I2 {
    public void method1(){
        I1.method1();
        I2.method1();
    }
}
interface I1{
    static void method1(){
        System.out.println("interface 1");
    }
}
interface I2{
    static void method1(){
        System.out.println("interface ");
    }
}
class tastar{
    public static void main(String[] args) {
        demo d = new demo();
        d.method1();
    }

}

