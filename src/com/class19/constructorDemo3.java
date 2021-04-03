package com.class19;

public class constructorDemo3 {
    String name;
    double salary;
    double bonus;
    int numberOfDaysWorked;
    double bonusPercentage;


    constructorDemo3(String name,double salary,int numberOfDaysWorked, double bonusPercentage){
        this.name=name;
        this.salary=salary;
        this.bonus=10000;
        this.numberOfDaysWorked=numberOfDaysWorked;
        this.bonusPercentage=bonusPercentage;
    }
    void calcuateAndPrintBonus(){
        if(numberOfDaysWorked>=300){
            bonus=bonus;

        }else{
            bonus=bonus/2;

        }
    }

    public static void main(String[] args) {

        constructorDemo3 ramobj= new constructorDemo3("Ram",140000,300,100);
        ramobj.calcuateAndPrintBonus();
        System.out.println(ramobj.bonus);
        System.out.println(ramobj.name);
        System.out.println(ramobj.salary);
        System.out.println(ramobj.numberOfDaysWorked);
       ramobj.calcuateAndPrintBonus();




    }

}
