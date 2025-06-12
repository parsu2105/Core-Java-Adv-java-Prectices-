package com.Revijan;

interface Vehica {
void start();
}
class Caar implements Vehica {
	@Override
	public void start() {
		System.out.println("Car is starting with key ignition.");
	}
}
class Bikk implements Vehica{
	@Override
	public void start() {
		System.out.println("Bike is starting with kick.");
	}
}
public class VehiclE {
	public static void main(String[] args) {
		Vehica s1 = new Caar();
		s1.start();
		Vehica s2 = new Bikk();
		s2.start();
	}
}    
