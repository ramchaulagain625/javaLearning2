package com.class14;

public class NewClassExamTester {
    public static void main(String[] args) {
        NewClassExample newClassExample=new NewClassExample();
        newClassExample.result();
        System.out.println(newClassExample.greater(600,50));
        newClassExample.testingNumber(23);
        System.out.println(newClassExample.array());
        double []array1= {10.34,23.4,20.6};
        System.out.println(array1);
    }
}
