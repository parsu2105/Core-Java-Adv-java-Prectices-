package mybasicpractice;

import java.util.Scanner;

public class MyFirst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking input from the user
		System.out.println("ENTER THE NUMBER : ");
		int num = sc.nextInt();
		
		
		//Handling edge case where number is <=1
		if(num<=1) {
			System.out.println(num + " is not a prime number.");
		} else {
			boolean isPrime = true;
			//Checking divisibility from 2 to sqrt(num)
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num%i ==0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(num + " is a prime number");
			}else {
				System.out.println(num + " is not a prime number. ");
			}
		}
		
		
		sc.close();
		
	}

}
