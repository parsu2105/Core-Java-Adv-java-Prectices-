package com.kodewala;
import java.util.*;
public class RemoveEvenUsing8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(23,44,55,66,88,99,75));
System.out.println("Original List :" +list);
list.removeIf(num -> num % 2 == 0);
System.out.println(list);
	}

}
