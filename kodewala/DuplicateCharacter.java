package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String[] arr = {"Delhi", "Paris", "London", "Tokyo", "Oslo"};
		
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		
		Iterator<String> itr = list.iterator();
		
		int count = 0;
		
		while(itr.hasNext()) {
			
			String citynm = itr.next().toLowerCase();
			
			Set<Character> original = new HashSet<Character>();
			
			Set<Character> duplicate = new HashSet<Character>();
			
			for(char brk : citynm.toCharArray()) {
				
				if(!original.add(brk)) {
					duplicate.add(brk);
					break;
				}
				
			}
			
			if(!duplicate.isEmpty()) {
				System.out.println(citynm  + "  " + duplicate);
				count++;
			}
			
		}
		
		System.out.println("Total cities with repeating characters: " + count);

	}

}
