package com.KodeWalaClassTest;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "Nishant");
		student.put(2,"Prashant");
		student.put(3, "Amit");
		student.put(4, "Vicky");
		
		System.out.println("HasMap: " + student);
		
		for(Map.Entry<Integer, String> s1 : student.entrySet()) {
			System.out.println("Roll" + s1.getKey() + " : " + s1.getValue());
		}
		System.out.println("Student 1 :" +student.get(2));
		
		student.put(3, "TTTTTTT");
		
		
		for(Map.Entry<Integer, String> s2 : student.entrySet()) {
			System.out.println("ROll: " +s2.getKey() + " : " +s2.getValue());
		}
	}

}
