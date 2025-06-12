package com.kodewala;
import java.util.*;
public class ArrayinputReverseExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> arr = new ArrayList<>();
		
		System.out.println("ENTER THE FIVE NAME");
		for(int i=0; i<5; i++) {
			arr.add(sc.nextLine());
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		
		arr.remove("PRASHANT");
		
		if(arr.contains("ABHISHEK")) {
			System.out.println("PRESENT");
		}else {
			System.out.println("NOT CONTAIN");
		}
		
		for(String name : arr) {
			System.out.println(name);
		}

	}

	

}
