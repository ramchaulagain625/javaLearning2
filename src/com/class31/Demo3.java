package com.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries = new HashMap<>();
        groceries.put("Egg",12.99);
        groceries.put("milk",5.99);
        groceries.put("tomato",4.59);
        groceries.put("Potato",18.99);
       Set<Map.Entry<String,Double>> entrySet= groceries.entrySet();
        Iterator<String> iterator=groceries.keySet().iterator();

       Set<String>string= groceries.keySet();
       for(String key:string){
           if(groceries.get(key)<=15){
               groceries.remove(key);
           }

           System.out.println(key+" "+groceries.get(key));

       }
    }
}
