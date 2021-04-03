package com.class21.Animal;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog= new Dog("Jacky");
        dog.bark();
        dog.run();;
        dog.sleep();
        dog.eat();

        Cat cat = new Cat("Birali");
        cat.meow();
        cat.eat();
        cat.run();
        cat.sleep();
        cat.walk();


    }
}
