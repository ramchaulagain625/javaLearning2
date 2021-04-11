package com.class28.Abstraction;

public abstract class Parent {

   abstract void method1();
   final void method2(){

   }
}
class child extends Parent{
    @Override
    public void method1(){

    }
}