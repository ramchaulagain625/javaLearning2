package com.class21.Animal;

import com.class21.Animal.Animal;

public class Cat extends Animal {
    Cat(String name){
     this.name=name;
    }
    void meow(){
        System.out.println(name+" is meow meow ------meow");
    }
}
