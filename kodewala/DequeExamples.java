package com.kodewala;
import java.util.*;
public class DequeExamples {
	public static void main (String[] args) {

	Deque<Integer> deque = new ArrayDeque<>();
	
	//first
	 deque.offerFirst(10);
     deque.offerFirst(20);
     deque.offerFirst(30);
     
     //last 
     deque.offerLast(49);
     deque.offerLast(45);
     deque.offerLast(66);
     
     System.out.println("DEQUE" + deque);
     
     //Removing from front and back
     System.out.println("Removed First: " + deque.pollFirst());
     System.out.println("Removed First: " +deque.pollFirst());
     System.out.println("Removed First: " + deque.pollFirst());
     System.out.println("Removed Last: " + deque.pollLast());
     System.out.println("Removed Last: " + deque.pollLast());
     System.out.println("Removed Last: " + deque.pollLast());
     
     System.out.println("DEQUE: " + deque.isEmpty());
}
}
