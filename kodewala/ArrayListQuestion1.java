package com.kodewala;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListQuestion1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(12);
		list.add(7);
		list.add(20);
		list.add(33);
		list.add(2);
		list.add(9);
		System.out.println(list); //This is printing the list of the number
		Iterator<Integer> num = list.iterator();
		while(num.hasNext()) {
			int s1 = num.next();
			if(s1%2==0) {  //this is checking the number is odd or even
				num.remove();   //this removing the even number
			}
		}
		System.out.println(list); //This is the odd number
		

	}

}
