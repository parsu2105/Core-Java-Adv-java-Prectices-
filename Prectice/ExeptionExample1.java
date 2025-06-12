package com.Prectice;

public class ExeptionExample1 {

	public static void main(String[] args) {
		System.out.println("Start 1");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println(10/2);		
			}
		
		System.out.println("Start 2");

	}

}
