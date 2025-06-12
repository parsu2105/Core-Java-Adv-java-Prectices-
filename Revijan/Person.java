package com.Revijan;



public class Person {
   String name;
   int age;
   Person(String name, int age){
	   this.name = name;
	   this.age = age;
	   
   }
   void introduce() {
	   System.out.println("THIS IS MY NAME -> " +name);
	   System.out.println("THIS IS MY AGE -> " + age);
   }
   
   public static void main(String[] args) {
	Employ s1 = new Employ(400000,"It","prashant kumar",20);
	
	
	
}
}

class Employ extends Person{
	int salary ;
	String department;
	Employ(int salary, String department, String name, int age) {
		super(name,age);
		this.salary = salary;
		this.department = department;
		introduce();
	}
	void introduce() {
		super.introduce();
		System.out.println("MY DEPARTMENT IS -> " +department );
		System.out.println("MY SALARY IS -> " +salary);
	}
	
}
