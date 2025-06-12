package com.Prectice;

import java.util.*;
public class ArrayListAddNumber {

	public static void main(String[] args) {
	
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("PRASHANT");
		arr.add("SURAJ");
		arr.add("VICKY");
		arr.add("PRKESH");
		arr.add("RAJU");
		arr.add("GANDHI");
		
		
		for(int i=arr.size()-1;i>=0;i--) {
			System.out.println(arr.get(i));
		}
		
		
	}

}
