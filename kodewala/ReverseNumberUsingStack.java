package com.kodewala;
import java.util.*;
public class ReverseNumberUsingStack {

	public static void main(String[] args) {
		String number ="123456789";
		Deque<Character> list = new ArrayDeque<>();
		
		for(char ch : number.toCharArray()) {
			list.push(ch);
		}
		
		StringBuilder reversed = new StringBuilder();
		while(!list.isEmpty()) {
			reversed.append(list.pop());
		}
		
		System.out.println("ORIGINAL STRING: " + number);
		System.out.println("REVERSED STRING: " + reversed.toString());

	}
}