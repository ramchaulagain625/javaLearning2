package com.Class29;

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> drinks= new ArrayList<>();
        drinks.add("fanta");
        drinks.add("juic");
        drinks.add("beer");
        drinks.add("sprite");
        drinks.add("cola");
        System.out.println(drinks);
        for(String drink:drinks){
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(drinks.indexOf(drink),"water");
            }

        }
        System.out.println(drinks);
    }
}
