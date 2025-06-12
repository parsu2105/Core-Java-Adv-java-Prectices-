package com.Prectice;

 abstract class Anima {
public abstract void makeSound();
void display() {
	System.out.println("ANIMAL MAKE SOUND");
}
}
class Dog extends Anima{

	@Override
	public void makeSound() {
		System.out.println("BHAU BHAU");
		
	}
	
}
class Cat extends Anima{

	@Override
	public void makeSound() {
		System.out.println("MIAU MIAU");
		
	}
	
}
class AnimalW{
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.makeSound();
		d1.display();
		Cat c1 = new Cat();
		c1.display();
		c1.makeSound();
	}
}
