package com.Revijan;

public class Vehiclee {
 void startEngine() {
	 System.out.println("THIS IS THE VEHICLE ENGING");
 }
 public static void main(String[] args) {
		Vehiclee s1 = new Vehiclee();
		s1.startEngine();
		Carr s2 = new Carr();
		s2.startEngine();
		Bikee s3 = new Bikee();
		s3.startEngine();
	}
}
class Carr extends Vehiclee{
	void startEngine() {
		System.out.println("START ENGINE OF CAR");
	}
}
class Bikee extends Vehiclee{
	void startEngine() {
		System.out.println("START ENGINE OF BIKE");
	}
	
}
