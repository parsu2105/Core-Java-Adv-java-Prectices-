package com.Prectice;

class Employee { // Renamed for consistency
    public void calculateSalary() {
        System.out.println("THIS IS YOUR EMPLOYEE SALARY: 10,000");
    }
}

class Manager1 extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("THIS IS YOUR MANAGER SALARY: 300,000");
    }
}

class Developer extends Employee { // Corrected spelling
    @Override
    public void calculateSalary() {
        System.out.println("THIS IS YOUR DEVELOPER SALARY: 400,000");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.calculateSalary();
        
        Manager1 mgr = new Manager1();
        mgr.calculateSalary();
    }
}
