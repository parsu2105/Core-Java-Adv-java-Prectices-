package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RepeatedCharacterInwordCityName {

	public static void main(String[] args) {
		String [] name1 =  {"Delhi", "Mumbai", "Kolkata", "Agra", "Indore", "Bhopal"};
		List<String> list = new ArrayList<String>(Arrays.asList(name1));
		
		Iterator<String> name = list.iterator();
		while(name.hasNext()) {
			String word = name.next();
			Set<Character> s1 = new HashSet<Character>(); 
			boolean found = false;
			String loweCity = word.toLowerCase();
			for(char ch : loweCity.toCharArray()) {
				if(s1.contains(ch)) {
					found = true;
					break;
				}else {
					s1.add(ch);
				}
			}
			if(found) {
			System.out.println(word);
		}
		
		
	}
	}

}
