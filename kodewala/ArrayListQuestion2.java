package com.kodewala;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListQuestion2 {
	public static void main(String[] args) {
		 String arr[] = {"Virat", "Rohit", "Dhoni", "Hardik", "Gill"};
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		Iterator<String> name = list.iterator();
		boolean found = false;
		while(name.hasNext()) {
			String nm = name.next(); 
			if(nm.equals("Rohit")) {     //this is checking the number is present int the arr or not
				found = true;
				break;
			}
			
		}if(found) {
			System.out.println("Found");
		}else {
		 System.out.println("not found");
		}
		System.out.println(list);
		
		
		

	}
	

}
