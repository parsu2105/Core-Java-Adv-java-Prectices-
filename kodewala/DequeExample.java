package com.kodewala;
import java.util.*;
public class DequeExample {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		
		deque.addFirst("PRASHANT");
		deque.addFirst("NISHANT");
		deque.addLast("ISHANT");
		deque.addLast("VISHAKHA");
		deque.addFirst("SHRUTI");
		
		System.out.println("Deque: " + deque);
		
		System.out.println("REMOVED FROM FRONT: " + deque.removeFirst());
		System.out.println("REMOVED FROM LAST: " + deque.removeLast());
		
		System.out.println("Deque after removal: " +deque);
		
		System.out.println("PEEK FIRST DEQUE: " + deque.peekFirst());
		System.out.println("PEEK LAST DEQUE: " + deque.peekLast());
		

	}

}
