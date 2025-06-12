package com.kodewala;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListQuestion4 {
	


	public static void main(String[] args) {
		
		String[] arr = {"Apple", "Banana", "Mango", "Orange", "Pineapple"};
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Original List =" + list);
		Iterator<String> s1 = list.iterator();
		while(s1.hasNext()) {
			String name = s1.next();
			if(name.contains("Mango")) {
				list.set(2, "Grapes");
			}
		}
		System.out.println("After Replace =" + list);
	}

}
