package com.kodewala;

public class PalindromNumber {

	public static void main(String[] args) {
		int a=121;
		int b =a;
		int sum =0;
		while(a>0) {
			int mod=a%10;
			sum =(sum * 10) + (mod % 10);;
			a/=10;
			
		}
		if(b==sum)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}
