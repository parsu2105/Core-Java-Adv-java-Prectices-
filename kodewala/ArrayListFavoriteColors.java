package com.kodewala;
import java.util.*;
class ArrayListFavoriteColors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> arr = new ArrayList<>();
		
		arr.add("RED");
		arr.add("BLUE");
		arr.add("YELLOW");
		arr.add("PINK");
		arr.add("BLACK");

		
		for(String name : arr) {
			System.out.println(name);
		}
		
		System.out.println("THE SIZE OF THE LIST =" + arr.size());
		System.out.println(arr.get(3));

	}

}
