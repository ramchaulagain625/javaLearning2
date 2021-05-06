package com.class32.tasks;

import java.util.TreeMap;

public class task1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> building= new TreeMap<>();
        building.put(1,"Google");
        building.put(2,"Google");
        building.put(1,"Syntax");
        building.put(3,"Ibm");
        building.put(4,"Syntax");
        building.put(5,"Apple");
        building.put(6,"Amazon");
        System.out.println(building);
        System.out.println(building.size());
        building.put(7,"micro");
        building.replace(4,"Netfilx");
        System.out.println(building);

    }
}
