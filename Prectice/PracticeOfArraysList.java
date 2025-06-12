package com.Prectice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PracticeOfArraysList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add(1, "Mango");

		System.out.println("List: " + list);
		System.out.println("Elemets at index 2 =" + list.get(2));
		list.remove("Apple");
		System.out.println("After removing 'Apple' : " + list);

		for (String word : list) {
			if (word.equals("Mango")) {
				System.out.println("THIS FRUIT IS EXIST IN THE MART ->" + word);
				break;
			}
		}

		List<Integer> listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(33);
		listOfInteger.add(56);
		listOfInteger.add(23);
		listOfInteger.add(20);
		listOfInteger.add(204);
		listOfInteger.remove(2);
		System.out.println("THIS IS THE MODIFY LIST ->" + listOfInteger);
		Iterator<Integer> num = listOfInteger.iterator();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (num.hasNext()) {
			int integer = num.next();
			if (integer > max) {
				max = integer;
				min = max;
			}
		}
		System.out.println("MAX VALUE =" + min);

		Iterator<Integer> even = listOfInteger.iterator();
		while (even.hasNext()) {
			int num1 = even.next();
			if (num1 % 2 == 0) {
				System.out.println(num1);
			}
		}
		
		
		
		HashSet<String> products = new HashSet<String>();
		products.add("Laptop");
		products.add("SmartPhone");
		products.add("Tablet");
		products.add("HeadPhone");
		products.add("SmartPhone");
		products.add(null);
		
		Iterator<String> s1 = products.iterator();
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}

	}

}
