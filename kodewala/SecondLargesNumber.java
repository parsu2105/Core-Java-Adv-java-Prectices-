package com.kodewala;
import java.lang.reflect.Array;
import java.util.*;


public class SecondLargesNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(77,88,55,11,44,99,55));
		System.out.println(list);
		
		if(list.size()<2) {
			System.out.println("Second larges does not exist");
			return ;
		}
		int first = Integer.MIN_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int num : list) {
			if(num>first) {
				second = first;
				first = num;
			}else if(num > second && num != first) {
				second = num;
			}
		}
		
		if(second == Integer.MIN_VALUE) {
			System.out.println("no second larges (all elemnets same?");
		}else {
			System.out.println("Second Largest : " + second);
		}
	}

}
