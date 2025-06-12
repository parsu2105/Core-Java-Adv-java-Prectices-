package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicateCharacterIncityName {

	public static void main(String[] args) {// TODO Auto-generated method stub
		String[] name1 = {"Delhi", "Paris", "London", "Tokyo", "Oslo"};
		List<String> list = new ArrayList<String>(Arrays.asList(name1));
		Iterator<String> s1 = list.iterator();
		int count=0;
		while(s1.hasNext()) {
			String name = s1.next();
			Set<Character> setlist = new HashSet<Character>();
			boolean found = false;
			String word = name.toLowerCase();
			for(char c : word.toCharArray()) {
				if(setlist.contains(c)) {
					
				found = true;
				break;
			}else {
				setlist.add(c);
			}
		}
			if(found) {
				System.out.println(name);
				
				count++;
			}
	}
		System.out.println("Total cities with repeating characters: " + count);

}
}
