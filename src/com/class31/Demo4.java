package com.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries = new HashMap<>();
        groceries.put("Egg",12.99);
        groceries.put("milk",5.99);
        groceries.put("tomato",4.59);
        groceries.put("Potato",18.99);
        Set<String>mapKeys= groceries.keySet();
        Iterator<String> iterator=mapKeys.iterator();
        while(iterator.hasNext()){
            String value= iterator.next();
            Double value1=groceries.get(value);
            if(value.contains("o")){
                iterator.remove();
            }
        }
        System.out.println(groceries);
    }
}
