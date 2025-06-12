package com.Prectice;

public class EmployeL {
private String name;
private String salary;
private int age;

void setValue(String nm, String slry, int ag) {
	name=nm;
	salary=slry;
	age=ag;
}
void displayDetail() {
	System.out.println(name);
	System.out.println(salary);
	System.out.println(age);
}

public static void main(String[] args) {
	EmployeL s1 = new EmployeL();
	s1.setValue("Prashant-Kumar", "800000", 20);
	s1.displayDetail();
}
}
