package com.class25.overriding;

public class RamTester {


    public static void main(String[] args) {
      /*  Parents p = new Ram("sabi");
        p.sleep();
        p.eat();*/
//        Ram ram= new Ram("ram");
//        ram.sleep();
//        ram.eat();

        Ram r=(Ram) new Parents("Ram");// downcasting
        r.sleep();
        Parents parent = new Ram("Ram");//upcasting
        ((Ram) parent).run();
        r.run();
    }
}
