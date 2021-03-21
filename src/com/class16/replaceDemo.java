package com.class16;

public class replaceDemo {
    public static void main(String[] args) {
        String var1="syntax is best343526.Batch nine is great";
        System.out.println(var1.replaceAll("[0-9]",""));
        String var2="@#$%^&*234567asdfghjkAaaaFGHNNNBBB";
        System.out.println(var1.replaceAll("[^0-9]",""));
    }
}
