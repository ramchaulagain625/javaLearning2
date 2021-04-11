package com.class28.interfaces;

public interface Iparent {
    int number =10;//all variables interfaces are public.
    //no need to make public static and final because they are already public static and final.

void method1();

}
interface Iparent1 {
    void method();

}
class AdvanceChild  implements Iparent,Iparent1{

    @Override
    public void method1() {
        System.out.println("From first parent");
    }

    @Override
    public void method() {
        System.out.println("second parent");
    }
}
