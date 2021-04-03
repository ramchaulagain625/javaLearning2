package com.class23;

public class Test {
    public static void main(String[] args) {
        System.out.println("parent");
    }
}
class child1 extends Test{
    public static void main(String[] args) {
        System.out.println("child");
    }

}
class child2{
    public static void main(String[] args) {
        String [] args1={"hello"};
        child1.main(args1);
    }
}
