package com.kodewala;
import java.util.*;
public class ArrayInputExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> arr = new ArrayList<>();
		
		System.out.println("ENTER THE FIVE NAME");
		
		//Taking 5 name input from user
		
		for(int i = 0; i < 5 ; i++) {
			arr.add(sc.nextLine());
		}
		
		//Remove "SURAJ" if exists
		arr.remove("SURAJ");
		
		Collections.sort(arr, Collections.reverseOrder());
		
		//Check if "RAUSHAN" exists
		
		if(arr.contains("RAUSHAN")) {
			System.out.println("FOUND");
		}else {
			System.out.println("NOT FOUND");
		}
		
		// Print final list
		
		System.out.println("\n Final List:");
		
		for(String name : arr) {
			System.out.println(name);
		}
	}

}
