package com.KodeWalaClassTest;

import java.util.ArrayList;
import java.util.List;

import com.Prectice.PracticeOfArraysList;

public class ListDemo {

	public static void main(String[] args) {
		List<String> s1 = new ArrayList<String>();
		s1.add("Prashant");
		s1.add("Nishant");
		s1.add("Prashant");
		s1.add("Vishakha");
		s1.add("Shruti");
		s1.add("Ishant");
		s1.add("Nishant");
		System.out.println("Total List Of Student" + s1);
		s1.remove("Nishant");
		System.out.println("AfterRemoving-> " +s1);
		System.out.println("Geting Index =" + s1.get(2));
		
		for(String name : s1) {
			System.out.println(name);
		}
		
		System.out.println("-------------------------");
		ArrayList<String>  s2 = new ArrayList<String>();
		s2.add("PRAKASH");
		s2.add("PRAKASH_KUMAR");
		s2.add("NISHANT_KUMAR");
		for(String name : s2) {
			System.out.println(name);
		}
	}

}
