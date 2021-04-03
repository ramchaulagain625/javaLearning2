package com.class23.bank;

public class Bank {
    void chargeTransferFee(double amount){
        System.out.println("your fee is "+ amount*0.05);
    }
}
class BankOfAmerica extends Bank{
    void chargeTransferFee(double amount){
        System.out.println("your fee is "+ amount*0.05);
    }
}
class ChaseBank extends Bank{
    void chargeTransferFee(double amount){
        System.out.println("your fee is "+ amount*0.03);
    }
}
class citizen extends Bank{

}