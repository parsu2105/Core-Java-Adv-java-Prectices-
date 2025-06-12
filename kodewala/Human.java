package com.kodewala;

class Person1{
	String name;
	int age;
	Person1(String _name,int _age){
		this.name=_name;
		this.age=_age;
		System.out.println("this is the parent class construtur");
	}
}
class Man extends Person1{
	int rollno;
	Man(int _rollno){
		super("PRASHANT KUMAR",20);
		this.rollno=_rollno;
		System.out.println("this is child class constructor");
	}
}
public class Human {

	public static void main(String[] args) {
	Man s1=new Man(34);
	System.out.println("NAME OF THE PERSON="+s1.name);
	System.out.println("age of the person="+s1.age);
	System.out.println("roll no of the person="+s1.rollno);
	}

}
