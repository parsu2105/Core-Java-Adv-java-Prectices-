package com.KodeWalaClassTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setDemo {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("Apple");
		s1.add("Orange");
		s1.add("Banana");
		s1.add("Apple");
		s1.add(null);
		
		System.out.println("HasSet(no Order): "+s1);
		for(String nameOfFruit : s1) {
			System.out.println(nameOfFruit);
		}
		
		Set<String> student = new LinkedHashSet<String>();
		student.add("Prashant:");
		student.add("Nishant:");
		student.add("Prakash:");
		student.add("Ashish:");
		student.add("Rishav:");
		
		System.out.println(student);
		
		
		

	}

}
