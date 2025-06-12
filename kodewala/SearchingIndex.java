package com.kodewala;
import java.util.*;
public class SearchingIndex {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(60);
		number.add(70);
		number.add(80);
		number.add(90);
		
		int search = 40;
		int index = number.indexOf(search);
		if(index != -1) {
			System.out.println(search + " found at index " +index);
		}else {
			System.out.println(search +"not found in the list.");
		}
		
	}

}
