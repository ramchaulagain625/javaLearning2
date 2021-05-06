package com.class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Ram");
        arrayList.add("Sabi");
        arrayList.add("Azzi");
        arrayList.add("Unknown");
        Map<Integer,String> map= new HashMap<>();
        map.put(123456,"Azozi");
        map.put(123457,"Ram");
        map.put(123458,"Danilo");
        map.put(123459,"Mike");

        Map<Integer,String> map1= new HashMap<>();
        map1.put(128,"Anusha");
        map1.put(123,"Ram");
        map1.put(12345,"Egune");
        map1.put(1234,"Mj");
        map1.putAll(map);
        System.out.println(map1);
        map1.remove(1234);
        System.out.println(map1);
        System.out.println(map1.get(123));
        System.out.println(map1.containsKey(123));
        System.out.println(map1.containsValue("Ram"));
        map1.clear();
        System.out.println(map1);
        System.out.println(map1.isEmpty());






    }
}
