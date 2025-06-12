package com.kodewala;
import java.util.*;
public class IntegerListToArray {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(11);
		numbers.add(14);
		
		System.out.println("YOUR ARRAYLIST =" +numbers);
		
		// converting to array
		Integer[] numArray = new Integer[numbers.size()];
		numArray = numbers.toArray(numArray);
		
		System.out.println("ARRAY ELEMENTS");
		for(int num : numArray) {
			System.out.println("YOUR NUMBER IS = " + num);
		}
	}

}
