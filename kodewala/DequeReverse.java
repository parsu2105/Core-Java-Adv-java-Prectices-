package com.kodewala;
import java.util.*;
public class DequeReverse {
	public static void main(String[] args) {
		String s1 = "PRASHANT";
		Deque<Character> list = new ArrayDeque<>();
		for(char name : s1.toCharArray()) {
			list.push(name);
		}
		
		StringBuilder reversed = new StringBuilder();
		while(!list.isEmpty()) {
			reversed.append(list.pop());
		}
		
		System.out.println("Original String: " + s1);
		System.out.println("Reversed String: " + reversed.toString());
	}
}
