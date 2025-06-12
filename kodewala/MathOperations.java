package com.kodewala;

public class MathOperations {
static	int square(int num) {
		return num*num;
	}
static int cube(int q) {
		return q * q * q;
	}

static double celsiusToFahrenheit(double c) {
	return (c*9/5)+32;
}
	public static void main(String[] args) {
		int sendForSquare = square(4);
		System.out.println("SQURARE " + sendForSquare);
		int sendForQ = cube(3);
		System.out.println("CUBE " + sendForQ);
		double a =celsiusToFahrenheit(98.6);
		System.out.println("TEMPRATURE " + a);
	}
	
	
}
