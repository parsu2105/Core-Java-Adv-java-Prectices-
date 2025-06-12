package com.kodewala;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
	
	public static void main(String[] args) {
		String str = "orange apple orange apple watermalane";
		Map<String, Integer> list = new HashMap<>();
		
		for(String word : str.split(" ")) {
			list.put(word, list.getOrDefault(word, 0)+1);
		}
		
		System.out.println(list);
	}

}
