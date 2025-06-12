package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListQuestion12 {

	public static void main(String[] args) {
		String[] arr = {"Sky", "Apple", "Orange", "Fly", "India", "Crush"};
		List<String> list = new ArrayList<String>(Arrays.asList(arr));

		int count = 0;

		Iterator<String> name = list.iterator();
		while (name.hasNext()) {
			String checkString = name.next();
			char[] check = checkString.toLowerCase().toCharArray();

			int vowelCount = 0;
			for (char ch : check) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
					
				}
			}
			if(vowelCount == 2) {
				System.out.println(checkString);
				count++;
			}

			}
		System.out.println("Total words with exactly 2 vowels: " + count);
		}

	}

