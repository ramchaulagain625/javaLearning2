package com.class27.vechiles;

public abstract class Vehicles{
    String vin_number;
    static int totalVehicles;
    Vehicles(String vin_number){
        totalVehicles++;
        this.vin_number=vin_number;
    }
    public void totalVehiclesCreated(){
        System.out.println("we drive "+totalVehicles+"vehicles");
    }
    public void  drive(){
        System.out.println("can drive");
    }
    public void stop(){
        System.out.println("vehicles can stop");
    }
    public abstract void start();
}
 abstract class Car extends Vehicles{
    String carType;
    Car(String vin_number,String carType){
        super(vin_number);
        this.carType=carType;
        }

     public void drive(){
            System.out.println("Car can run very fast");
        }
        public abstract void speed();
        }
        class BMW extends Car{
    String model;
    String make;
    BMW(String vin_number,String carType,String make,String model){
        super(vin_number,carType);
        this.make=make;
        this.model=model;
    }

            @Override
            public void start() {
                System.out.println("Key less start");
            }

            @Override
            public void speed() {
                System.out.println("Can go very fast up to 500 miles per hour");
            }
            public void display(){
                System.out.println("Model "+model+" "+make+"is making and its vin is "+vin_number);
            }
        }
