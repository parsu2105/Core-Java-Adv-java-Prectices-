package com.kodewala;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(34);
		list.add(12);
		list.add(54);
		list.add(32);
		list.add(78);
		System.out.println(list);
		Iterator<Integer> name = list.iterator();
		while(name.hasNext()) {
			int num = name.next();
			if(num % 2 ==0) {
				name.remove();
				}
		}
			
		
		System.out.println(list);

	}

}
