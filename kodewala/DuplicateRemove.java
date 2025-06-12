package com.kodewala;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemove {

	public static void main(String[] args) {
		int arr[]= {2,3,42,2,3,43,45,43,45,65,35,34,34};
		Set<Integer> list = new TreeSet<Integer>();
		for(int num : arr) {
			list.add(num);
		}
		System.out.println(list);

	}

}
