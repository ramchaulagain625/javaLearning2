package com.Class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");
        System.out.println(subjects);
        Iterator<String> iterator= subjects.iterator();

while(iterator.hasNext()){
    String var= iterator.next();
    if(var.length()>4){
        iterator.remove();
    }
}
        System.out.println(subjects);

    }
}
