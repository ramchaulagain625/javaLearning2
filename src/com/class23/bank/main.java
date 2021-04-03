package com.class23.bank;

public class main {
    public static void main(String[] args) {
        BankOfAmerica bofa= new BankOfAmerica();
        bofa.chargeTransferFee(1000);
        ChaseBank cb= new ChaseBank();
        cb.chargeTransferFee(2000);
        citizen cit=new citizen();
        cit.chargeTransferFee(4000);
    }
}
