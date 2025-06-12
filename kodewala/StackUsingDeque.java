package com.kodewala;
import java.util.*;
public class StackUsingDeque {

	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<>() ;
			
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Stack: " + stack);
		System.out.println("Top : " + stack.peek() );
		System.out.println("Pooped: " + stack.pop());
		System.out.println("Stack: " + stack);
		

	}

}
