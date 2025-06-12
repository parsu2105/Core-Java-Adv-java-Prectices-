package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListQuestion {

	public static void main(String[] args) {
		Integer[] arr= {10, 20, 5, 30, 15};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		Iterator<Integer> num = list.iterator();
		while(num.hasNext()) {
			int a = num.next();
			if(a>max) {
				max = a;
			}
			if(a<min) {
				min = a;
			}
		}
		System.out.println("MAX VALUE =" + max);
		
		
		System.out.println("MIN VALUE =" + min);
		
		   

	}

}
