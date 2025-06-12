package com.kodewala;
import java.util.Scanner;
public class FindTheCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NAME");
		
		String obj = sc.nextLine();
		
	
		
	char[] name = obj.toCharArray();
	
	for(char search : name) {
		if(search == 'A') {
			System.out.println("Start with A");
			break;
		}
	}
	System.out.println("NOT START WITH A");

	}

}
