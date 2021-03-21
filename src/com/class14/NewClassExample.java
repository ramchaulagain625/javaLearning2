package com.class14;

public class NewClassExample {
    public void result(){
        for(int i=0;i<5;i++){
            System.out.println("Batch 9 is great");
        }
    }
    public int greater(int num1,int num2){
        if(num1>num2){
            return num1;
        }else
            return num2;
    }
    public void testingNumber(int x){
        if(x%2==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
    public int array(){
        int sum=0;
       int  array1[]={1,2,3,4};
       for(int i=0;i<=array1.length;i++){
          sum+=i;
       }
       return sum;
    }
    public double array1(double array1[]){
        double sum=0;
        for(double element:array1){
            sum+=element;
        }
        return sum;
    }
}
