package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCityFindDuplicate {

	public static void main(String[] args) {
		String[] arr = {"Delhi", "Paris", "London", "Tokyo", "Oslo"};
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		int count = 0 ;
		for(String s1 : list) {
			Set<Character> check = new HashSet<Character>();
			Set<Character> duplicates = new HashSet<>();
			String lowercase = s1.toLowerCase();
			for(char c : lowercase.toCharArray()) {
			if(!check.add(c)) {
				duplicates.add(c);
			}
			
		}
			if (!duplicates.isEmpty()) {
			    System.out.println(s1 + " → " + duplicates);
			    count++;
			}

		}
		System.out.println("Total cities with repeating characters: " + count);
		
	}

}
