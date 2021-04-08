package com.class25.overriding;

public class Ram extends Parents{
    Ram(String name) {
        super(name);
    }
    @Override
    void eat(){
        super.eat();
        System.out.println(name+" like to eat momo and chaumin as well");
    }

    @Override
    void sleep() {
        System.out.println(name+" sleep as long as i can");
    }

    public void run(){
        System.out.println(name+" is run fast");
    }
}
