package com.Revijan;

public class Employee {
	
void calculateSalary() {
	System.out.println("CALCULATE SALRY");
}


public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.calculateSalary();  // Parent class method

    Managerr1 m1 = new Managerr1();
    m1.calculateSalary();  // Overridden method in subclass

    Employee e2 = new Managerr1();  // Polymorphism
    e2.calculateSalary();  // Calls overridden method at runtime
}
}
class Managerr1 extends Employee{
	void calculateSalary() {
		System.out.println("EXTRA BONUS");
	}
}
