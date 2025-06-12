package com.kodewala;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class M1 {
	public static void main(String[] args) {
		String name = "PRASHANT";
		List<Character> list = new ArrayList<Character>();
		Set<Character> set = new HashSet<Character>();
		for (char s1 : name.toCharArray()) {
			list.add(s1);
			set.add(s1);
		}
		for (char s2 : set) {
			int frequency = Collections.frequency(list, s2);
			System.out.println("Charcter:" + s2 + " Frequency :" + frequency);

		}

	}
}
