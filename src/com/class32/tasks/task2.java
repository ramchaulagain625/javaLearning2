package com.class32.tasks;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {


        Map<String, String> country = new TreeMap<>();
        country.put("Afghanistan", "Kabul");
        country.put("Pakistan", "Islamabad");
        country.put("India", "New Delhi");
        country.put("Bangladesh", "Dhaka");
        country.put("United States", "Washington DC");
        Set<String> countryValues = country.keySet();
        Iterator<String> iterator = countryValues.iterator();//Iterator
        while (iterator.hasNext()) {
            String c = iterator.next();
            String keys = country.get(c);
        }
        System.out.println(country);
        System.out.println("---------------------------");
        Set<Map.Entry<String, String>> countrySet;//Enhanced for loop
        countrySet = country.entrySet();
        for (Map.Entry<String, String> eachMap : countrySet)
            System.out.print(eachMap + ", ");
    }
}