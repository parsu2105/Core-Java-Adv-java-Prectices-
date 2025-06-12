package com.kodewala;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		//push element
		
		stack.push("APPLE");
		stack.push("ORANGE");
		stack.push("CHERRY");
		stack.push("MANGO");
		
		System.out.println("Stack: " + stack); //
		
		System.out.println("Pooped: " + stack.pop()); //MANGO
		System.out.println("Top Element: " + stack.peek()); //Cherry
		System.out.println("IS EMPTY ? : " + stack.isEmpty()); //false

	}

}
