package com.kodewala;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString {

	public static void main(String[] args) {
		String str ="apple banana apple orange banana apple";
		Map<String, Integer> freq = new HashMap<String, Integer>();
		
		for(String word : str.split(" ")) {
			freq.put(word, freq.getOrDefault(word, 0) + 1);
		}
		
		System.out.println(freq);

	}

}
