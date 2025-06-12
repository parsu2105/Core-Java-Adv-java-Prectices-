package com.kodewala;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ArrayListQuestion11 {

	public static void main(String[] args) {
		Integer arr[]= {22,88,99,66,44,22,88,4,77};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		Iterator<Integer> num = list.iterator();
		while(num.hasNext()) {
			int number = num.next();
			if(number<min) {
				secondMin = min;
				min = number;
			}else if(number < secondMin && number != min) {
				secondMin=number;
			}
		}
		System.out.println("SECOND Smallest NUMBER = " + secondMin);
		System.out.println("SMALLEST = " + min);
		
		

	}

}
