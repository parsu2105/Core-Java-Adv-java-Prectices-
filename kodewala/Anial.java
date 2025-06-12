package com.kodewala;

 abstract class MainAnial {
	
	abstract void sound(); //abstract method
	
	void sleep() {
		System.out.println("Sleeping........");
	}
	
}

class Dogge extends MainAnial{
	void sound() {
		System.out.println("DOG BARKS");
	}
}

public class Anial{
public static void main(String[] args) {
	MainAnial s1 = new Dogge();
	s1.sound();
	s1.sleep();
}
}
