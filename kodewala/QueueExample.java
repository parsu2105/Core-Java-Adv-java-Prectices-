package com.kodewala;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		Queue<String> list = new LinkedList<>();
		
		list.offer("PRASHANT");
		list.offer("NISHANT");
		list.offer("SHUBHAM");
		
		System.out.println("Queue: " + list);
		System.out.println("Front: " + list.peek());
		System.out.println("REMOVED: " + list.poll());
		System.out.println("Queue after removal: " + list);
	}

}
