package com.kodewala;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapExample {

	public static void main(String[] args) {
		Map<String, Integer>  scores = new LinkedHashMap<>();
		scores.put("Prashant", 69);
		scores.put("Nishant", 88);
		scores.put("Ishant", 78);
		
		System.out.println(scores);
		
		

	}

}
