package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




public class ListRemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> name = new ArrayList<>();
		name.add(4);
		name.add(78);
		name.add(55);
		name.add(79);
		name.add(12);
		name.add(79);
		System.out.println(name);
		
		
		List<Integer> list = new ArrayList<>();
		for(int sort : name) {
			if(!list.contains(sort)) {
				list.add(sort);
			}
		}
		System.out.println(list);
	}

}
