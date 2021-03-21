package com.class15;

import java.util.Locale;

public class String2 {
    public static void main(String[] args) {
        String name = "Ram";
        String name1 = new String("Ram");
        System.out.println(name.equals(name1));
        System.out.println(name.length());
        name = "Sabita";
        int len = name.length();
        System.out.println(len);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    }
}
