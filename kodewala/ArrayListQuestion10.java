package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListQuestion10 {

	public static void main(String[] args) {
		Integer[] arr = {25, 10, 40, 5, 15, 30};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		int min = Integer.MAX_VALUE;
		int secondmin = Integer.MAX_VALUE;
		Iterator<Integer> num = list.iterator();
		
		while(num.hasNext()) {
			
		   int s1 = num.next();
		   
		   if(s1 < min) {
			   
			   secondmin = min;
			   
			   min = s1;
			   
		   }else if(s1 < secondmin  && s1 != min) {
			   
			   secondmin = s1;
			   
		   }
		   
		}
		System.out.println("Smallest =" + min);
		System.out.println("SECOND LARGEST " +secondmin);
		

	}

}
