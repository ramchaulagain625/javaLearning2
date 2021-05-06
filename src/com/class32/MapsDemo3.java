package com.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapsDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> items= new LinkedHashMap<>();
        items.put("Soap",1.99);
        items.put("Shirt",15.99);
        items.put("Pillow",12.99);
        items.put("pant",51.99);
        items.put("Blanket",122.99);
        System.out.println(items.size());
      Iterator<String> iterator = items.keySet().iterator();
      while(iterator.hasNext()){
          String item= iterator.next();
          if(item.contains("o")){
              iterator.remove();
          }
      }


    }



}
