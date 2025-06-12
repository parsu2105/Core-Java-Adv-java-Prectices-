package com.kodewala;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListQuestion3 {

	public static void main(String[] args) {
		Integer [] arr = {10, 15, 20, 25, 30, 35, 40, 45, 50};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("Before Removing " + list);
		Iterator<Integer> num = list.iterator();
		while(num.hasNext()) {
			int match = num.next();
			if(match % 2 == 0) {
				num.remove(); //This is used for removing single element from the list
			}
		}
		
		System.out.println("After Removing " + list);
	}

}
