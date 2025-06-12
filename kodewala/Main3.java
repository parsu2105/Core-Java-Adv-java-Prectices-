package com.kodewala;
class Employe2{
	String name;
	int age;
	Employe2(){
		this("prashant",33);
		System.out.println("THIS IS THE NON PERAMETRISE CONSTRUCTOR");
	}
	Employe2(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("THIS IS THE PERAMETRISE CONSTURCTOR");
	}
}

public class Main3 {

	public static void main(String[] args) {
		Employe2 employe=new Employe2();
		System.out.println("THIS IS THE NAME="+employe.name+","+employe.age);
		

	}

}
