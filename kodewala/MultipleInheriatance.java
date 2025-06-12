package com.kodewala;

class A{
	void car(){
		System.out.println("THIS IS THE A Class Method");
	}
}
class B extends A   {
	void car() {
		System.out.println("THIS IS THE B Class Method"); //this is the multiple inheritance this is not possible in java
	}
}
public class MultipleInheriatance {

	public static void main(String[] args) {
		System.out.println("THIS INHERITANCE IS NOT SUPPORTED IN JAVA");
	}

}
