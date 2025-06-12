package com.kodewala;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateValueExists {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "A");
		
		Set<String> valueSet = new HashSet<>();
		boolean hasDuplicate = false;
		
		for(String val : map.values()) {
			if(!valueSet.add(val)) {
				hasDuplicate = true;
				break;
			}
		}
		System.out.println("Duplicate Values? " +hasDuplicate);

	}

}
