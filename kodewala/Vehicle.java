package com.kodewala;
class Car1{
	String type;
	Car1(){
		System.out.println("THIS IS THE NON PERAMETRISE || DEFAULT CONSTRUTOR");
	}
}
class Cycle extends Car1{
	String brand;
	Cycle(){
		super();//calls the parent class Constructor
		System.out.println("Cycle Consturctor");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		Cycle s1=new Cycle();

	}

}
