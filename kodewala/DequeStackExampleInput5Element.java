package com.kodewala;
import java.util.*;
public class DequeStackExampleInput5Element {

	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<>();
		
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		
		
		while(!stack.isEmpty()) {
			System.out.println("STACK LIST: " +stack.pop());
		}
	/*	
		System.out.println("STACK LIST : " + stack);
		System.out.println("STACK POP: " + stack.pop());
		System.out.println("StACK POP: " + stack.pop());
		System.out.println("STACK POP: " + stack.pop());
		System.out.println("StACK POP: " + stack.pop());
		System.out.println("STACK POP: " + stack.pop());
		System.out.println("STACK POP: " + stack.isEmpty());
		
		*/
		System.out.println("STACK LIST : " + stack);

	}

}
