package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListQuestion8 {

	public static void main(String[] args) {
		Integer [] arr = {40, 10, 20, 50, 30};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		Iterator<Integer> num = list.iterator();
		while(num.hasNext()) {
			int no = num.next();
			if(no > max) {
				secondMax = max;
				max = no;
			}else if(no > secondMax && no != max){
				secondMax = no ;
			}
		}
		System.out.println("Second Largest = " + secondMax);


	}

}
