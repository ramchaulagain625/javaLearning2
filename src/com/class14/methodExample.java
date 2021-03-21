package com.class14;

public class methodExample {
    public static void main(String[] args) {
        int num1=10;
        int num2=-10;
        int num3=0;
        checknumber(num1);
        checknumber(num2);
        checknumber(num3);

    }
    public static void checknumber(int num){
        if(num>0){
            System.out.println(num+" is greater than 0");
        }else if(num<0){
            System.out.println(num+" is less than 0");
        }else {
            System.out.println(num+" is equal than 0");
        }
    }
}
