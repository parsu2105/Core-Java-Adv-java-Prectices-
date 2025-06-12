package com.Prectice;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("PRASHANT KUMAR");
		arr.add("NISHANT KUMAR");
		arr.add("ISHANT KUMAR");
		arr.add("SHRUTI KUMARI");
		arr.add("VISHAKHA KUMARI");
		arr.add("RAUSHAN KUMAR");
		arr.add("PRASHANT KUMAR");
		arr.add("NISHANT KUMAR");
		arr.add("ISHANT KUMAR");
		arr.add("NULL");
		arr.add(3,"RAJA JI");
		
		
		
		System.out.println("THIS IS THE NAME OF THE ARRAY LIST = " +arr);
		System.out.println(arr.get(0));
		System.out.println(arr.get(5));
		System.out.println(arr.get(10));
		System.out.println(arr.set(0,"HAMARRAJAJI"));
		System.out.println(arr.size());
		System.out.println(arr.remove(1));
		

	}

}
