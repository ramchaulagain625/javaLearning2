package com.class32;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("Banana",75);
        map.put("Gova",113);
        map.put("Apple",1);
        map.put("pineapple",12);
        map.put("orange",100);
        map.put("mango",50);
        map.put("Kiwi",78);
        System.out.println(map);
        System.out.println(map.get("mango"));
        map.remove("Banana");
        System.out.println(map);
        System.out.println(map.containsKey("orange"));



    }
}
