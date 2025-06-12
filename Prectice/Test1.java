package com.Prectice;

interface Animal11{
	void makeSound();
}
class Dog11 implements Animal11{
	public void makeSound() {
		System.out.println("Dog barks!");
	}
}

public class Test1 {
	public static void main(String[] args) {
		Animal11 s1 = new Dog11();
		s1.makeSound();
	}
}
