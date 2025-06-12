package com.kodewala;
class Employee{
	String name;
	Employee(String _name){
		this.name=_name;
		System.out.println("THIS IS THE NAME OF THE EMPLOYE"+name);
	}
}
public class Managerr extends Employee{
     String department;
	Managerr(String name,String _department){
		super(name);
		this.department=_department;
		System.out.println("NAME="+name +","+"DEPARTMENT="+","+_department);
		
	}
	public static void main(String[] args) {
		Managerr s1=new Managerr("PRASHANT","IT");
		
	}

} 
