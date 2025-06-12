package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;    

public class ListSetDemo {



	public static void main(String[] args) {
		String[] arr = { "PRASHANT", "NISHANT", "ISHANT", "PRAKASH", "KUNDAN" };
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		
		
		
	//	Iterator<String> s1 = list.iterator();
	//	while(s1.hasNext()) {
	//		String name = s1.next();
	//		System.out.println(name);
	//		list.add("AMAN");
	//		System.out.println(list);
	//	}
		
		
		CopyOnWriteArraySet<String> setlist = new CopyOnWriteArraySet(Arrays.asList(arr));
		Iterator<String> s2 = setlist.iterator();
		while(s2.hasNext()) {
			String name1 = s2.next();
			System.out.println(name1);
			list.add("NANU");
			
		}
		System.out.println(list);
		
		
		
	

		

	}

}
