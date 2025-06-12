package com.Revijan;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("AMIT", 25);
		map.put("Rahul", 30);
		map.put("Priya", 28);
		
		System.out.println("Amit's Age:" +map.get("AMIT"));
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " +entry.getValue());
			
		}
			
			Map<String,Integer> s1 = new TreeMap<String, Integer>();
			s1.put("Prashant", 5);
			s1.put("Vishakha", 4);
			s1.put("Nishant", 3);
			s1.put("Ishant", 3);
			s1.put("Vicky", 6);
			
			System.out.println(s1.get("Prashant"));
			for(Map.Entry<String, Integer> m1 : s1.entrySet()) {
				System.out.println(m1.getKey() + " " +m1.getValue());
			}
			
			
			
			Map<String, Integer> student = new LinkedHashMap<String, Integer>();
			student.put("Prashant", 3);
			student.put("Nishant", 4);
			student.put("Ishant ", 5);
			student.put("Kundan ", 6);
			student.put("Vishakha ", 7);
			student.put(" Vishnu ", 8 );
			
			System.out.println(student.get("Kundan"));
			for(Map.Entry<String, Integer> s11 : student.entrySet()) {
				System.out.println(s11.getKey() +"" + s11.getValue());
			}
			
		
	}
}
