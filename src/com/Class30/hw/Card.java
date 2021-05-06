package com.Class30.hw;

public abstract class Card {
    Card(){

    }
    public abstract int getBalance(int balance);
    public abstract int setBalance(int maxBalance);
}
class MasterCard extends Card{

    @Override
    public int getBalance(int balance) {
        return balance;
    }

    @Override
    public int setBalance(int maxBalance) {
        return maxBalance;
    }
}
class Visa extends Card{

    @Override
    public int getBalance(int balance) {
        return balance;
    }

    @Override
    public int setBalance(int maxBalance) {
        return maxBalance;
    }
}
class Discover extends Card{

    @Override
    public int getBalance(int balance) {
        return balance;
    }

    @Override
    public int setBalance(int maxBalance) {
        return maxBalance;
    }
}
class CardTester{
    public static void main(String[] args) {
        MasterCard masterCard= new MasterCard();
        masterCard.getBalance(100);
        masterCard.setBalance(5000);
        Discover discover= new Discover();
        discover.setBalance(5000);
        discover.getBalance(400);
        Visa visa = new Visa();
        visa.setBalance(5000);
        visa.getBalance(100);

    }
}

