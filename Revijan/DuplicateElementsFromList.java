package com.Revijan;
	import java.util.*;
	import java.util.stream.Collectors;

	public class DuplicateElementsFromList {
	    public static void main(String[] args) {
	        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "banana", "grapes");

	        Set<String> duplicates = items.stream()
	            .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
	            .entrySet().stream()
	            .filter(entry -> entry.getValue() > 1)
	            .map(Map.Entry::getKey)
	            .collect(Collectors.toSet());

	        System.out.println("Duplicate Elements: " + duplicates);
	    }
	}



