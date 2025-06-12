package com.kodewala;
import java.util.*;
class ArrayListDay1Project {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("PRASHANT");
		arr.add("RAUSHAN");
		arr.add("NAMASTE");
		arr.add("RAHUL");
		arr.add("GAURAV");
		arr.add("SURABH");
		
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println(arr.get(3));
		System.out.println(arr.get(4));
		System.out.println(arr.get(5));
		
		System.out.println(arr.size());
		
		System.out.println(arr.isEmpty());
		
		for(String name : arr) {
			System.out.println(name);
		}

	}

}
