package com.Prectice;

import java.util.*;



public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> linkelist = new LinkedList<String>();
		
		linkelist.add("Nokia");
		linkelist.add("TATA");
		linkelist.add("Samsung");
		linkelist.add("LAVA");
		linkelist.add("OnePluse");
		linkelist.add("apple");
		
		linkelist.add(2,"Kala Jamun");
		
		System.out.println(linkelist);
	}
}
