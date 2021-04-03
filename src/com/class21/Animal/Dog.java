package com.class21.Animal;

import com.class21.Animal.Animal;

public class Dog extends Animal {
    Dog(String name){
        this.name=name;
    }

    void bark(){
        System.out.println(name+ " is bark");
    }
}
