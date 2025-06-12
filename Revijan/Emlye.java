package com.Revijan;

public class Emlye {
int salary ;
String name ;
Emlye(int salry, String name){
	this.salary = salry;
	this.name = name;
}
void show() {
	
	System.out.println("THIS is the emoploye name =" + name);
	
	System.out.println("THIS IS THE EMPLOYE SALARY =" + salary);
}

public static void main(String[] args) {
	
	Managerr s1 = new Managerr(300000, "PRASHANT","IT");
	
	s1.show();
}

}
class Managerr extends Emlye{
	String department;
	Managerr(int salary, String name, String department){
		super(salary, name);
		this.department = department;
	}
	@Override
	void show() {
		super.show();
		System.out.println("DEPARTMENT " +department);
	}
}
