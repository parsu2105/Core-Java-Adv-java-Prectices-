package com.kodewala;

public class Factorial1 {
	
	static int factorial(int n) {
		if(n==0) {
			return 1;
		}else {
			
			int num=n*factorial(n-1);
			System.out.println(num);
			return num;
		}
		
	}

	public static void main(String[] args) {
		int num1= factorial(5);
		System.out.println("FACTORIAL OF THE NUMBER =" + num1);
		

	}

}
