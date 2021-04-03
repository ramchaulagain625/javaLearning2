package com.class20;

public class Employee {
     String name;
    private String empId;
    private double salary;
    private String department;
  Employee(){
        System.out.println("Important line 1");
        System.out.println("Important line 2");
        System.out.println("Important line 3");
        System.out.println("Important line 4");
        System.out.println("Important line 5");
    }

    public Employee(String name){
        this.name=validateName(name);
    }
    public Employee(String name,String empId){
        this(name);
       // this.name=name;
        this.empId=empId;

    }
    public Employee(String name, String empId, double salary){
        this(name, empId);
        this.salary=salary;
    }


    public Employee(String name, String empId, double salary, String department) {
       /* this.name = name;
        this.empId = empId;
        this.salary = salary;*/
        this(name, empId, salary);
        this.department = department;
    }
    void printinfo(){
        System.out.println("Name:"+ name+"employeeID :"+empId);
    }
    String validateName(String name){
        if(name.length()<15){
            return name;

        }else{
            return null;
        }
    }
}
