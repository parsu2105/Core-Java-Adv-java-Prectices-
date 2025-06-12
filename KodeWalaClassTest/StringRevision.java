package com.KodeWalaClassTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringRevision {

	public static void main(String[] args) {
//		String s1 = new String("PRASHANT");
//		String s2 = new String("PRASHANT");
//		System.out.println(s1.equals(s2) + " <- CONTENT COMPARISION");
//		System.out.println(s1==s2 + " <- REFRANCE COMPARISION");
//		
//		StringBuffer s3 = new StringBuffer("NISHANT");
//		StringBuffer s4 = new StringBuffer("NISHANT");
//		System.out.println(s3.equals(s4) + " <- Refrance Comparision");
//		System.out.println( s3 == s4 );
		
		
//		String s1 = new String ("SPRING");
//		s1.concat("FALL");
//		
//		String s2 = new String("WINTER");
//		s2.concat("SUMMER");
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
		
//		String s1 = new String ("YOU CANNOT CHANGE ME");
//		String s2 = new String ("YOU CANNOT CHANGE ME");
//		System.out.println(s1==s2);
//		
//		String s3 = "YOU CANNOT CHANGE ME";
//		System.out.println(s1==s3);
//		
//		String s4 = "YOU CANNOT"+" CHANGE ME";
//		System.out.println(s3==s4);
//		
//		String s6 = "YOU CANNOT";
//		String s7 = s6 + " CHANGE ME";
//		System.out.println("-----" +s7);
//		System.out.println(s1==s7);
//		
//		final String s8 = "YOU CANNOT";
//		String s9 = s8 + " CHANGE ME";
//		System.out.println(s9);
//		System.out.println(s4==s9);
		
//		List<String> names = List.of("A B", "C D");
//		List<Stream<String>> mapped = names.stream().map(s->Arrays.stream(s.split(" "))).collect(Collectors.toList());
//		System.out.println(mapped);
//		
//		List<String> flattened = names.stream().flatMap(s->Arrays.stream(s.split(" "))).collect(Collectors.toList());
//		System.out.println(flattened);
		
//		List<List<String>> nested = List.of(
//				List.of("Apple", "Banana"),
//				List.of("Orange", "Mango"),
//				List.of("Grapes")
//				
//				);
//		
//		List<String> flatList = nested.stream().flatMap(List::stream).collect(Collectors.toList());
//		System.out.println(flatList);
//		
//		
//		List<List<String>> s1 = List.of(
//				List.of("ORANGE","GRAPES"),
//				List.of("MANGO","LICHI"),
//				List.of("WATERMALEN","PINAPLE")
//				);
//		List<String> arr = s1.stream().flatMap(List::stream).collect(Collectors.toList());
//		System.out.println(arr);
//		
//		List<String> lines = List.of("ONE,TWO", "THREE,FOUR");
//		List<String> words = lines.stream().flatMap(lin->Arrays.stream(lin.split(","))).collect(Collectors.toList());
	


		List<Integer> nums = List.of(3,3,4,5,24,5,765,45,6,4,6);
	List<Integer> unique =	nums.stream().distinct().collect(Collectors.toList());
	System.out.println(unique);
	
	 

		
		

	}

}
