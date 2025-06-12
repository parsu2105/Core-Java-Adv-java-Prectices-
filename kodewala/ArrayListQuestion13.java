package com.kodewala;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListQuestion13 {

	public static void main(String[] args) {
		String[] arr = {"Delhi", "Mumbai", "Kolkata", "Agra", "Indore", "Bhopal"}; 
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		Iterator<String> name = list.iterator();
		while(name.hasNext()) {
			String word = name.next();
			char[] characters = word.toCharArray();
			Arrays.toString(characters);
			
			if(characters.equals(word.toCharArray())) {
			     continue;
			}
			System.out.println(word);
		}
		
		
		
	}

}
