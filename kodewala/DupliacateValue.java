package com.kodewala;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DupliacateValue {

	public static void main(String[] args) {
		Map< Integer, String> list = new HashMap<Integer, String>();
		
		list.put(1, "A");
		list.put(2, "B");
		list.put(3, "A");
		list.put(1, "A");
		list.put(2, "B");
		list.put(3, "A");
		list.put(1, "A");
		list.put(2, "B");
		list.put(3, "A");
		Set<String> word = new HashSet<String>();
		boolean hasDuplicate = false;
		for(String check : list.values()) {
			if(!word.add(check)){
				hasDuplicate = true;
				break;
			}
		}
		
		System.out.println("Duplicate Values ? " +hasDuplicate);
		
	}

}
