package com.kodewala;
class Employe1{
	String name;
	int age;
	Employe1(){
		this("PRASHANT",24);
		System.out.println("THIS IS THE NON PERAMETRISED CONSTRUCTOR");
		
	}
	Employe1(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("THIS IS THE PEREMITRISED CONSTRUCTOR");
	}
}
public class Main1 {

	public static void main(String[] args) {
		Employe1 employe=new Employe1();
		System.out.print(employe.name);
		System.out.println(employe.age);
		

	}

}
