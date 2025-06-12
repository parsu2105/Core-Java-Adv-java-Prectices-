package com.kodewala;

interface Parent1{
	void what();
}
interface Child1 extends Parent1{
	void which();
}
class Son implements Parent1,Child1{
	public void what() {
		System.out.println("THIS IS THE WHAT----1");		
	}
	public void which() {
		System.out.println("THIS IS THE WHICH----2");
	}
}
public class MultipleInheritanceInterface {

	public static void main(String[] args) {
		Son son=new Son();
		son.what();
		son.which();

	}

}
