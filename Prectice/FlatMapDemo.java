package com.Prectice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<List<String>> number = Arrays.asList(Arrays.asList("THIS", "s", "n", "list"),
				Arrays.asList("Kodewala", "s", "coching"), Arrays.asList("THIS", "is", "a", "student"));
		System.out.println(number);
		List<String> s = number.stream().flatMap(list -> list.stream()).filter(n -> n.length() > 2)
				.map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(s);

		List<List<Integer>> s1 = Arrays.asList(Arrays.asList(4, 5, 6, 1, 2, 3, 1),
				Arrays.asList(5, 6, 4, 7, 8, 9, 1, 52), Arrays.asList(7, 5, 8, 9, 4, 5, 6, 1));
		System.out.println(s1);
		List<Integer> num = s1.stream().flatMap(list -> list.stream()).filter(n -> n > 3).map(n -> n)
				.collect(Collectors.toList());
		System.out.println(num);

		List<List<String>> word = Arrays.asList(Arrays.asList("THIS IS THE BOY AND SHE IS GIRL BOTH ARE BULL"),
				Arrays.asList("THIS IS THE GADHA "), Arrays.asList("THIS IS THE SNAKE"));
		System.out.println(word);
		List<String[]> s5 = word.stream().flatMap(list -> list.stream()).filter(n -> n.length() > 3).sorted()
				.map(n -> n.split("")).collect(Collectors.toList());
		System.out.println(s5);
	
		
		        List<List<String>> name = Arrays.asList(
		                Arrays.asList("THIS IS THE ANIMAL"),
		                Arrays.asList("THIS IS THE BOY"),
		                Arrays.asList("THIS IS THE GIRL"),
		                Arrays.asList("THIS IS THE GOD"));

		        Set<String> s0 = name.stream()
		                .flatMap(set -> set.stream())
		                .filter(n -> containsVowel(n))
		                .collect(Collectors.toSet());

		        s0.forEach(System.out::println);
		    }

		    static boolean containsVowel(String str) {
		        str = str.toLowerCase();
		        return str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u");
		    }
		}

	

