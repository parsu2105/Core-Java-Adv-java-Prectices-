package com.kodewala;
import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		
		names.add("PRASHANT");
		
		names.add("ISHANT");
		
		names.add("NISHANT");
		
		//Convert to array
		
		String[] namesArray = new String[names.size()];
		namesArray = names.toArray(namesArray);
		
		System.out.println("Array elements:");
		for(String name : namesArray) {
			System.out.println(name);
		}
		

	}

}
