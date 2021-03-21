package com.class14;

public class repl88 {
    String breed;
    String name;
    String color;


    public static void main(String []args){
        String bev="bark";
        String bev1="run";
        String bev2="play";
        printBehaviors(bev);
        printBehaviors(bev1);
        printBehaviors(bev2);

        repl88 dog = new repl88();
        dog.name="Husky";
        dog.name="Bulldog";
        dog.name="Labrador";

            System.out.println(dog.name+" can "+bev);
            System.out.println(dog.name+" can "+bev1);
            System.out.println(dog.name+" can "+bev2);
    }
    public static void printBehaviors(String bev){
       

    }
}
