package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedCharacterInWord {

	public static void main(String[] args) {
		String[] arr = {"Delhi" , "Mumbai" , "Kolkata" , "Agra" , "Indore" , "Bhopal"};
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		for(String city : list) {
			Set<Character> seen = new HashSet<>();
			String lowerCity = city.toLowerCase();
			boolean hasRepeat = false;
			for(char ch : lowerCity.toCharArray()) {
				if(seen.contains(ch)) {
					hasRepeat = true;
					break;
				}else {
					seen.add(ch);
				}
			}
			if(hasRepeat) {
				System.out.println(city);
			}
		}

	}

}
