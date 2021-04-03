package com.class19;

public class hwOne {
    int a,b,c;
     public hwOne(){

        a=10;
        b=20;
        c=30;
        int div=c/a;

    }
    public void add(){
        int add=a+b+c;
        System.out.println(add);
    }

    public static void main(String[] args) {
        hwOne obj= new hwOne();

        obj.add();
    }
}
