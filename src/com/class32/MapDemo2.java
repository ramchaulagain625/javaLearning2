package com.class32;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> students= new HashMap<>();
        students.put(1,"Ram");
        students.put(2,"Ariana");
        students.put(3,"Rohean");
        students.put(4,"Karina");
        students.put(5,"Bryan");
        System.out.println(students);
       Collection<String> values=students.values();
        for (String student:values
             ) {
            System.out.println(student);
        }
        Set<Integer> integers = students.keySet();
        for (Integer integer:integers
             ) {
            System.out.println(integer);


        }
    }
}
