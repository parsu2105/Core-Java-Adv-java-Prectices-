package com.kodewala;


class Animal {
	void leg() {
		System.out.println("4leg");
	}
	void teeth() {
		System.out.println("52 long teeth");
	}
}

public class SingleInheritance extends Animal {         //this is the example of single inheritance.

	void lion() {
		System.out.println("this is the lion");
	}
	void cow() {
		System.out.println("THIS IS THE COW");
	}
	public static void main(String[] args) {
		System.out.println("THIS IS THE ANIAL INFO");
		SingleInheritance singleinheritance=new SingleInheritance();
		singleinheritance.leg();
		singleinheritance.teeth();
		singleinheritance.lion();
		singleinheritance.cow();

	}

}
