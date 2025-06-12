package com.kodewala;

public class EmployeClonExam implements Cloneable {
	String name;
	int age;
	public EmployeClonExam(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("THIS IS THE name " +name);
		System.out.println("THIS IS THE age " +age);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeClonExam s1 = new EmployeClonExam("PRASHANT", 23);
		s1.print();
		EmployeClonExam s2 = (EmployeClonExam) s1.clone();
		s2.print();
	}
}
