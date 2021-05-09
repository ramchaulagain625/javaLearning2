package com.class34.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<Exception> getExceptionList(){
        List<Exception>list= new ArrayList<>();
        try {
            System.out.println(10/0);
        }catch (ArithmeticException a){
            list.add(a);
            System.out.println("Number cannot divided by zero");
        }
        try {
            String str= null;
            str.toLowerCase();
        }catch(NullPointerException e){
            list.add(e);
        }
        return list;
    }

    public static void main(String[] args) {
        for (Exception e:getExceptionList()
             ) {
            System.out.println(e.getMessage());// only descriptions of errors
            System.out.println(e);//Package name+ class name + descriptions
            e.printStackTrace();
        }
    }
}
