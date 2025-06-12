package com.Revijan;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FruitWord {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple","banana","apple","orange","banana","apple");
		Map<String, Long> wordCount = words.stream().collect(Collectors.groupingBy(w->w, Collectors.counting()));
		wordCount.entrySet().stream().filter(entry->entry.getValue()>0).forEach(entry->System.out.println(entry.getKey()+"->"+entry.getValue()));

	}

}
