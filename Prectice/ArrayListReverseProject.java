package com.Prectice;
import java.util.*;
public class ArrayListReverseProject {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("PRASHANT");
		arr.add("RAUSHAN");
		arr.add("BANTI");
		arr.add("SURAJ");
		arr.add("GOLU");
		arr.add("MANISH");
		arr.add("GULSHAN");
		
		
		Collections.reverse(arr);
		
		for(String name : arr) {
			System.out.println(name);
		}
		
		System.out.println(arr.size());

	}

}
