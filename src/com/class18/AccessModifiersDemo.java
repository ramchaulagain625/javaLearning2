package com.class18;

public class AccessModifiersDemo {
   public String name;
    private String BankAccountPassword;
    String SSNNumber;
    public void park(){
        System.out.println("Every one can access a public park");
    }
private void car(){
    System.out.println("Car is private me and my wife only can access");
}
    void printInFo(){
        System.out.println(name);
        System.out.println(BankAccountPassword);
    }






}
