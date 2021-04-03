package com.class24.demo1;

import com.class24.demo1.Contractor;
import com.class24.demo1.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.salary=100000;
        employee.getPaid();
        employee.goOnLeaves();
        Contractor contractor= new Contractor();
        contractor.salary=50;
        contractor.getPaid();

        Employee con = new Contractor();// widening or upcasting
        Contractor cons=(Contractor) new Employee();// narrowing or down casting
    }
}
