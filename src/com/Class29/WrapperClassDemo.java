package com.Class29;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int a =10;
        Integer aa=a;
        a=aa;

        Integer integer= new Integer(10);//boxing
        Integer integer1=20;//Autoboxing
        int abc=integer.intValue();//unboxing
        abc=integer;//Auto unboxing
    }
}
