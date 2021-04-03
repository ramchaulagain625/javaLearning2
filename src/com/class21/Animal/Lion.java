package com.class21.Animal;

import com.class21.Animal.Animal;

public class Lion extends Animal {
    Lion(String name){
        this.name=name;
    }
    void roar(){
        System.out.println(name +" is roar");
    }
}
