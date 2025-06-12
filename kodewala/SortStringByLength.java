package com.kodewala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength {

	public static void main(String[] args) {
	List<String> list = new ArrayList<>();
		list.add("APPLLE");
		list.add("car");
		list.add("banana");
		list.add("dog");
		
		System.out.println(list);
		
		Collections.sort(list , new Comparator<String>() {
			public int compare(String s1 , String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		System.out.println(list);
	}

}
