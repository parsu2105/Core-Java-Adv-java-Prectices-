package com.KodeWalaClassTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice1 {

	public static void main(String[] args) {
		List<String> names = List.of("Amit", "Ravi", "Saurav");
		
		List<String> result = names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
		System.out.println(result);
		
		Set<String> result1 = names.stream().collect(Collectors.toSet());
		System.out.println(result1);
		
		Map<String, Integer> s1 = new HashMap<>();
		s1.put("Prashant", 123);
		s1.put("Nishant", 432);
		s1.put("Iishant", 585);
		s1.put("Kishant", 678);
		
		Map<String, Integer> nameLengthMap ;
		
		
		
		
	}

}
