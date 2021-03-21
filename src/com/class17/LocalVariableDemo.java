package com.class17;

public class LocalVariableDemo {
    void printInFo(String name){
        System.out.println(name);
    }
    void info(String name,String address){
        System.out.println(name+address);

    }
    void infoWithPhone(long number,String name,String LastName){
        System.out.println(name+" "+LastName+" his number is "+number);
    }
    public static void main(String[] args) {
        String name1="Ram";
        for(int i=0;i<5;i++){
            System.out.println(i);
        }



    }
}
