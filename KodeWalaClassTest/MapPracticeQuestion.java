package com.KodeWalaClassTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapPracticeQuestion {

	public static void main(String[] args) {
		Map<Integer, String> list = new HashMap<Integer, String>();
		list.put(1, "Prashant");
		list.put(2, "Nishant");
		list.put(3, "Ishant");
		list.put(4, "Vishakha");
		list.put(4, "Rina");
		
		for(Entry<Integer, String> a : list.entrySet()) {
			System.out.println(a.getKey() + " -> " + a.getValue());
		}
		
		System.out.println("\nDoes Prashant Exist ? " + list.containsValue("Prashant"));
		System.out.println("Marks of key 1 (Prashant) : " + list.get(1));
		
		list.remove(4);
		Iterator<Entry<Integer, String>> s1 = list.entrySet().iterator();
		while(s1.hasNext()) {
		Entry<Integer, String> n =	s1.next();
		System.out.println("Key: " +n.getKey() + " -> "+ "Value: " + n.getValue());
		}
		
		for(int a : list.keySet()) {
			System.out.println(a + " ");
		}
		
		System.out.println("\nOnly Values:");
		for(String V : list.values()) {
			System.out.println(V + " : ");
		}
		
		
		

	}

}
