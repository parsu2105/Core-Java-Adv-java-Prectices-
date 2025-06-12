package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListQuestion9 {

	public static void main(String[] args) {
		Integer s1[] = {25,36,54,89,47,56,99};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(s1));
		int min = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
	    Iterator<Integer> number = list.iterator();
	    while(number.hasNext()) {
	    	int num = number.next();
	    	if(num>min) {
	    		secondLargest = min;
	    		min=num;
	    		
	    	}else if(num > secondLargest && num != min) {
	    		secondLargest = num;
	    	}
	    	
	    	
	    }
	    System.out.println(secondLargest);

	}

}
