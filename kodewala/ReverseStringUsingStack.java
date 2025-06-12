package com.kodewala;
import java.util.*;
public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String input = "prashant";
		
		//step 1: Create stack of Characters
		Deque<Character> stack = new ArrayDeque<>();
		
		//step 2: Push each character into the stack
		for(char ch : input.toCharArray()) {
			stack.push(ch);
		}
		
		//step 3: Pop characters from stack and build reverse String
		
		StringBuilder reversed = new StringBuilder();
		while(!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		
		System.out.println("Orginal String: " + input);
		System.out.println("Reversed String: " + reversed.toString());
	}

}
