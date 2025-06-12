package com.kodewala;
import java.util.*;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(44,66,88,99,25,66,45,68,79,11));
		System.out.println(list);
		int first = Integer.MIN_VALUE;
		int second = Integer.MAX_VALUE;
		for(int num : list) {
			if(num>first) {
				second=first;
				first=num;
				
			}else if(num>second && num != first) {
				second = num;
			}
		}
		if(second == Integer.MIN_VALUE) {
			System.out.println("no second largest");
		}else {
			System.out.println("SECOND LARGEST " + second);
		}
	}

}
