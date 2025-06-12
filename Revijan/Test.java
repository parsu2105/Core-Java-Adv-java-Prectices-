package com.Revijan;

abstract class Vehical{
	 abstract void wheel();
	public void handl() {
		System.out.println("ALL HAVE HANDAL");
	}
}

class Bike extends Vehical{
	 void wheel() {
		System.out.println("THIS IS THE 2 Wheeler");
	}
}
public class Test {

	public static void main(String[] args) {
		Vehical s1 = new Bike();
		s1.wheel();
		s1.handl();
		
		
	}

}
