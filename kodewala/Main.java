package com.kodewala;
class Car{
	String brand;
	int speed;
	Car(){
		this("NAINO",100);//this is calling the 2
		System.out.println("THIS IS THE DEFAULT CONSTRUTOR");
	}
	Car(String brand,int speed){
		this.brand=brand;
		this.speed=speed;
		System.out.println("THIS IS THE PERAMITRISE CONSTRUCTOR");
	}
}
public class Main {

	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println("THIS IS THE BRAND="+c1.brand+","+"Speed="+c1.speed);

	}

}
