package com.class31;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries = new HashMap<>();
        groceries.put("Egg",12.99);
        groceries.put("milk",5.99);
        groceries.put("tomato",4.59);
        groceries.put("Potato",18.99);
        System.out.println(groceries);
        groceries.put(null,null);
        groceries.put("Rice",16.99);
        groceries.put("orange",null);
        groceries.put("orange",35.09);
        System.out.println(groceries);


    }
}
