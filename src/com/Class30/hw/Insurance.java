package com.Class30.hw;

import java.util.ArrayList;

public abstract class Insurance {
    public Insurance(String insuranceName){

    }
    String insuranceName;
    public abstract void getQuote(String insuranceName);
    public abstract void cancelInsurance();

}
class Car extends Insurance{
    String carModel;

    public Car(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote(String CarModel) {
      this.carModel=carModel;
        System.out.println(carModel+" has been insured by us ");

    }

    @Override
    public String toString() {
        return "Car{" +
                "insuranceName='" + insuranceName + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Your insurance has been successfully cancel");
    }
}
class Pet extends Insurance{
String petType;

    public Pet(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote(String petType) {
        this.petType=petType;
        System.out.println(petType+" has been insured by us ");

    }

    @Override
    public String toString() {
        return "Pet{" +
                "insuranceName='" + insuranceName + '\'' +
                ", petType='" + petType + '\'' +
                '}';
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Your insurance has been successfully cancel");
    }
    }

class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote(String insuranceName) {
        System.out.println(insuranceName+" has been insured by us ");

    }
    public String toString() {
        return "Health{" +
                "insuranceName='" + insuranceName + '\'' +
                ", insuranceType='" + insuranceName + '\'' +
                '}';
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Your insurance has been successfully cancel");

    }
}
class InsuranceTaster{


    public static void main(String[] args) {
      Pet p = new Pet("liberty");
       /* p.getQuote("Doggy");
        p.cancelInsurance();*/
        Car c= new Car("liberty");
       /* c.getQuote("camry");
        c.cancelInsurance();
*/
        Health h = new Health("hawa");
       /* h.getQuote("life");
        h.cancelInsurance();
*/

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(c);
        insurances.add(h);
        insurances.add(p);
        for (Insurance obj:insurances
             ) {
            System.out.println(obj);
        }


    }
}

