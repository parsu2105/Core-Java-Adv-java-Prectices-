package com.Revijan;

public abstract class Animalll {
abstract void sound();

void sleep() {
	System.out.println("The animal is sleeping");
}


public static void main(String[] args) {
	Animalll s1 = new Doggg();
	s1.sleep();
	s1.sound();
	
	Animalll s2 = new Catt();
	s2.sleep();
	s2.sound();
}
}

class Doggg extends Animalll {
	public void sound() {
		System.out.println("DOG barks");
	}
}
class Catt extends Animalll{
	public void sound() {
		System.out.println("THE CAT MEOWS");
	}
}
