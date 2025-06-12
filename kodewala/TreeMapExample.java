package com.kodewala;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<String,Integer> students = new TreeMap<String, Integer>();
		students.put("Prashant", 47);
		students.put("Nishant", 100);
		students.put("Ishant", 10);
		students.put("Ishant", 1086);
		students.put("Zara", 78);
		students.put("Ankit", 92);
		students.put("Mona", 85);
		
		
		System.out.println(students);

	}

}
