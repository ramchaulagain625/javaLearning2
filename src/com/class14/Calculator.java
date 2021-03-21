package com.class14;

public class Calculator {
   public int add(int x,int y){
        int sum=x+y;
        return sum;
    }
    public int sub(int x,int y){
       int sub1=y-x;
       return sub1;
    }
    public int multi(int x,int y){
       int multi1=x*y;
       return multi1;
    }
    public int div(int x,int y){
       if(y!=0){
           int div1=y/x;
           return div1;
       }else
           return 0;

    }

    void isRaining(boolean isRain){
       if(isRain){
           System.out.println("Please take Umbrella");
       }else{
           System.out.println("You can go to Walk");
       }
    }
}
