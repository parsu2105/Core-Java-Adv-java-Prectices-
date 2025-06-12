package com.kodewala;
import java.util.Scanner;


public class AddTwoNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter First Number=");
		int a=sc.nextInt();
		System.out.print("Enter Second Number=");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("sum of two number="+c);
		sc.close();

	}

}
