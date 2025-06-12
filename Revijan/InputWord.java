package com.Revijan;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InputWord {
	public static void main(String[] args) {
		System.out.println(
				"------------------------------THIS IS THE NUMBER OF CHARACTER IN THE STRING ------------------------ ");

		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "orange");

		Map<String, Long> wordCount = words.stream()
				.collect(Collectors.groupingBy(w -> w.toLowerCase(), Collectors.counting()));

		wordCount.entrySet().stream().filter(entry -> entry.getValue() > 0)
				.forEach(entry -> System.out.println(entry.getKey() + "------------>" + entry.getValue()));

		Map<String, Long> wordCountt = words.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(wordCountt);

		Map<String, Long> s1 = words.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(s1);

		Map<String, Long> s2 = words.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		Map<String, Long> s4 = words.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		Map<String, Long> s5 = words.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		Map<String, Long> s6 = words.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		System.out.println(s2);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

		List<Integer> list = Arrays.asList(10, 23, 43, 34, 54, 34, 54);
		Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		result.forEach((key, value) -> System.out.println(key + ": " + value));
		
		List<Integer> list1 = Arrays.asList(43,32,4,365,32,76,324,54,76,23,12,43,65);
		Map<Boolean, List<Integer>> listofasList = list.stream().collect(Collectors.partitioningBy(n->n%2==0));
		listofasList.forEach((key,value)->System.out.println(key + ": " +value));

		
		IntSummaryStatistics stats = list.stream().mapToInt(n->n).summaryStatistics();
		System.out.println("COUNT : " + stats.getCount());
		System.out.println("Sum : " + stats.getSum());
		System.out.println("Average: " + stats.getAverage());
		System.out.println("Min" + stats.getMin());
		System.out.println("Max: " + stats.getMax());
		
		
	IntSummaryStatistics a = list1.stream().mapToInt(n->n).summaryStatistics();
	System.out.println("Sum : " +a.getSum());
	System.out.println("Min : " +a.getMin());
	System.out.println("Max : " +a.getMax());
	System.out.println("avrage : " +a.getAverage());
	System.out.println("count: " +a.getCount());
	
	
	Map<Boolean, List<Integer>> reult = list.stream().collect(Collectors.partitioningBy(n->n%2==0));
	reult.forEach((key,value)->System.out.println(key +" : " + value));
	
	
	
	
	
	
	}
}
