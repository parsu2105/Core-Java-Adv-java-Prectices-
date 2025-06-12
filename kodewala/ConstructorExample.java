package com.kodewala;

class Company{
	String name;
	Company(String name1){
		this.name=name1;
	}
}
class Employ extends Company{
	String nameofEmply;
	int age;
	Employ(int age, String nameofEmply){
		super("prashant");
		this.nameofEmply=nameofEmply;
		this.age=age;
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		Employ employ=new Employ( 44 ,"sdfgh");
		System.out.println(employ.name);
		System.out.println(employ.nameofEmply);
		System.out.println(employ.age);

	}

}
