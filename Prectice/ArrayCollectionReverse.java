package com.Prectice;
import java.util.*;
public class ArrayCollectionReverse {

	public static void main(String[] args) {
		
		List<String> arr = new ArrayList<>();
		
		arr.add("PRASHANT");
		arr.add("RAUSHAN");
		arr.add("BANTI");
		arr.add("SURAJ");
		arr.add("GOLU");
		arr.add("MANISH");
		arr.add("GULSHAN");
		
		Collections.reverse(arr);
		Collections.sort(arr, Collections.reverseOrder());
		
		for(String name : arr) {
			
			System.out.println(name);
		}
		
		if(arr.contains("RAUSHAN")) {
			System.out.println("Found");
			
		}else {
			System.out.println("NOT FOUND");
		}
	
		
	}

	

}
