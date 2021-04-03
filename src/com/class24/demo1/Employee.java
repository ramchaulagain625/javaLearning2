package com.class24.demo1;

public class Employee {
    double salary;
    void work(){
        System.out.println("Employee is working");
    }
    void getPaid(){
        System.out.println("employee is getting paid "+ salary+" other benefits");
    }
    void goOnLeaves(){
        System.out.println("Employee is going on leaves");
    }
}
class FullTimeEmp extends Employee{

}
class partTimeEmp extends Employee{
    @Override
    void goOnLeaves() {
        System.out.println("Part time Employee don't get leaves");
    }
}
class Contractor extends Employee{
    @Override
    void goOnLeaves() {
        System.out.println("contractor Employee don't get leaves");
    }

    @Override
    void getPaid() {
        System.out.println("contractor get paid by hourly");
    }
}
