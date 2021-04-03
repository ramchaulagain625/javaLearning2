package com.class23;

public class CreditCard {
    double balance;
    double interest;
    CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
    }
    void calcInterest(){
        System.out.println("Annual Interest payable: "+balance*(interest/100));
    }
}
class Visa extends CreditCard{
    Visa(double balance, double interest) {
        super(balance, interest);
    }
}
class AX extends CreditCard{
    AX(double balance, double interest) {
        super(balance, interest);
    }
    void calcInterest(){
        System.out.println("Annual Interest payable: "+balance*(interest/100));
    }
}
class TestCredit {
    public static void main(String[] args) {
        CreditCard cc=new CreditCard(25000,8.5);
        cc.calcInterest();
        Visa v=new Visa(15000, 10.5);
        v.calcInterest();
        AX a=new AX(20000, 12.5);
        a.calcInterest();
    }
}