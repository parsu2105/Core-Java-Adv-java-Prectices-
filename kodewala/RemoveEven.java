package com.kodewala;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEven {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		
		num.add(23);
		num.add(45);
		num.add(33);
		num.add(44);
		num.add(44);
		num.add(46);
		num.add(78);
		System.out.println(num);
		Iterator<Integer> s1 = num.iterator();
		while(s1.hasNext()) {
			int check = s1.next();
			if(check % 2 ==0) {
				s1.remove();
			}
		}
		System.out.println(num);

	}

}
