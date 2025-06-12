package com.kodewala;

interface Animal1{
	default void show() {
		System.out.println("THIS IS THE ANIMAL METHOD------");
	}
}
interface Dog {
	default void show() {
		System.out.println("THIS IS THE DOG METHOS---------");
	}
}
class  Cat implements Animal1,Dog{
	public  void show() {
		System.out.println("THIS IS THE CAT CLASS METHOD--------");
		Animal1.super.show();
	}
}
public class DefaultInterfaceInheritanceMultiple {

	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.show();
		

	}

}
