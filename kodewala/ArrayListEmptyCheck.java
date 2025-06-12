package com.kodewala;
import java.util.*;
class ArrayListEmptyCheck {

	public static void main(String[] args) {
		List<String> checkList = new ArrayList<>();
		
		System.out.println("LIST IS EMPTY = " +checkList.isEmpty());
		
		checkList.add("BANGALURU");
		checkList.add("PATNA");
		checkList.add("KOLKATA");
		
	
		
		System.out.println("City List");
		for(String list : checkList) {
			System.out.println(list);
		}
		
		
		
		

	}

}
