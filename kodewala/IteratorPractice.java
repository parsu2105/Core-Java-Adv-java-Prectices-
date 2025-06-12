package com.kodewala;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("APPLLE");
		list.add("car");
		list.add("banana");
		list.add("dog");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
		String fruit = iterator.next();
		System.out.println(fruit);

	}
		
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(9);
		list1.add(72);
		Iterator<Integer> meanu = list1.iterator();
		while(meanu.hasNext()) {
			int a = meanu.next();
			System.out.println(a);
			
		}
		
		Iterator<Integer> num = list1.iterator();
		while(num.hasNext()) {
			int num1 =num.next();
			System.out.println(num1);
		}
		
		
		
		
		
		Iterator<String> s1 = list.iterator();
		while(s1.hasNext()) {
			String nameOfFruit = s1.next();
			System.out.println(nameOfFruit);
		}
		
		
		list.forEach(fruit -> System.out.println(fruit));
		list1.forEach(a -> System.out.println(list1));

}
}
