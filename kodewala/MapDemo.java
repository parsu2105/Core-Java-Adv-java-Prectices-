package com.kodewala;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	static int count=0;
	public static void main(String[] args) {
		Map<String, Integer> list = new HashMap<String, Integer>();
		list.put("EARPHON", 500);
		list.put("EARBUDS", 5010);
		list.put("FAN", 5000);
		list.put("SPRAY", 500);
		list.put("SAMPU", 50);
		list.put(null, 50);
		
		
		System.out.println(list);
		System.out.println(list.get("FAN"));
		System.out.println(list.get("SPRAY"));
		System.out.println(list.get("SAMPU"));
		System.out.println(list.get("EARPHON"));
		
		Iterator<Entry<String, Integer>> iterator = list.entrySet().iterator();
		while(iterator.hasNext()) {
			count++;
			Entry<String, Integer> s1 = iterator.next();
			System.out.println(s1.getKey() + "" + s1.getValue());
			
			
			
		}
		System.out.println("THIS IS THE NUMBER OF THE COUNT =" +count);
		
		Iterator<Entry<String, Integer>> print = list.entrySet().iterator();
		while(print.hasNext()) {
			Entry<String, Integer> s2 = print.next();
			System.out.println(s2.getKey() + " "  +s2.getValue());
		}
		
		
		Iterator<Entry<String, Integer>> book = list.entrySet().iterator();
		while(book.hasNext()) {
			Entry<String, Integer> l ;
		}
		
		

	}

}
