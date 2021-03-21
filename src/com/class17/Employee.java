package com.class17;

public class Employee {
    String empID;
    static String CEO="Sumair";
    int salary;

    public static void main(String[] args) {

        Employee obj1=new Employee();
        obj1.empID="RS706";
        obj1.salary=140000;


        System.out.println("Employee ID: "+obj1.empID);
        System.out.println("Salary: "+obj1.salary);
        System.out.println("CEO: "+CEO);
        System.out.println("-------------------------------------------------------------------------------");

        Employee obj2=new Employee();
        obj2.empID="RS709";
        obj2.salary=155000;


        System.out.println("Employee ID: "+obj2.empID);
        System.out.println("Salary: "+obj2.salary);
        System.out.println("CEO: "+CEO);

    }
}
