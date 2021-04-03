package com.class19;


public class constructorDemo2 {
    double bonus;
    double salary;
    String name;
    constructorDemo2(){
        bonus=5000;
        salary=5000;
        name="Ram";


    }

    public static void main(String[] args) {
        constructorDemo2 obj= new constructorDemo2();
        System.out.println(obj.bonus);
        System.out.println(obj.name);

    }
}
