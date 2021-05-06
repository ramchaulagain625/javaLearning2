package com.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapsDemo4 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> items= new LinkedHashMap<>();
        items.put("Soap",1.99);
        items.put("Shirt",15.99);
        items.put("Pillow",12.99);
        items.put("pant",51.99);
        items.put("Blanket",122.99);
        Collection<Double> values = items.values();
        Iterator<Double> iterators= values.iterator();
        while(iterators.hasNext()){
            Double item=iterators.next();
            if(item<=15.00){
                iterators.remove();
            }
        }
        System.out.println(items);
    }
}
