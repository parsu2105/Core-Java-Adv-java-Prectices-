package com.kodewala;
import java.util.*;
public class ReverseStringUsingStack1 {
  
	public static void main(String[] args) {
		 String input = "PRASHANT";
		Deque<Character> stack = new ArrayDeque<>();
		
		for(char ch : input.toCharArray()) {
			stack.push(ch);
		}
		
		StringBuilder reversed = new StringBuilder();
		
		while(!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		
		System.out.println("ORIGINAL STRING: " + input);
		System.out.println("REVERSED STRING : " + reversed.toString());
		

	}

}
