package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListQuestion5 {

	public static void main(String[] args) {
		String[] s1 = {"HTML", "CSS", "JavaScript", "React", "Node"};
		List<String> list = new ArrayList<String>(Arrays.asList(s1));
		List<String> secondlist = new ArrayList<String>();
		for(String name : list) {
			secondlist.add(name);
		}
		System.out.println("Second List = " + secondlist);
		System.out.println("First List = " + list);

	}

}
