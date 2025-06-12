package com.Prectice;



public class FinallyPractice {

	public static void main(String[] args) {
		
		try {
			System.out.println("this is the try block");	
			System.exit(0);
			System.out.println(10/0);
			
			return;
			}
		catch(Exception e)
		{
			System.out.println("this is the catch block");
			return;
		}
		finally {
			System.out.println("THIS IS THE FINALLY BLOCK EXECUTED ");
		}
	}

}
