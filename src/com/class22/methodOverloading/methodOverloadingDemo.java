package com.class22.methodOverloading;

public class methodOverloadingDemo {
    void add (int a , int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(double a,double b,double c){
        System.out.println();

    }

    void add(int ...arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        methodOverloadingDemo methodOverloadingDemo= new methodOverloadingDemo();
        methodOverloadingDemo.add(10,20);
        int []arr={20,40,30,10,50};
        methodOverloadingDemo.add(arr);
        methodOverloadingDemo.add(10.5,30.3);
        methodOverloadingDemo.add(30.3,40.4,50.5);

        int []arra={10,20,30};
        methodOverloadingDemo.add(arra);
        methodOverloadingDemo.add(10,30,80,89,90,78,67,68,90,45,57);


    }

}
