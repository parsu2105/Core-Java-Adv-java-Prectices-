package com.kodewala;


import java.util.*;

public class SearchingElements {

	public static void main(String[] args) {
		List<String>  fruits = new ArrayList<>();
		
		fruits.add("ORANGE");
		fruits.add("GRAPES");
		fruits.add("GAUVA");
		fruits.add("APPLLE");
		fruits.add("LEAMON");
		fruits.add("WATERMALEN");
		fruits.add("BANANA");
		
		String search = "GAUVA";
		int index = fruits.indexOf(search);
		System.out.println(search +" FOUND AT INDEX "+index);
		
		if(fruits.contains(search)) {
			System.out.println("FOUND");
		}else {
			System.out.println("NOT FOUND");
		}
	}

}
