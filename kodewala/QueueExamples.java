package com.kodewala;
import java.util.*;
public class QueueExamples {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		//Adding elements
		
		queue.offer(10);
		queue.offer(11);
		queue.offer(12);
		queue.offer(13);
		queue.offer(14);
		queue.offer(15);
		
		System.out.println("Queue: " + queue);
		
		System.out.println("Removed: " + queue.poll());
		System.out.println("Removed: " + queue.poll());
		System.out.println("Removed: " + queue.poll());
		System.out.println("Removed: " + queue.poll());
		System.out.println("Removed: " + queue.poll());
		System.out.println("Removed: " + queue.poll());
		System.out.println("Removed: " + queue.offer(7));
		System.out.println("Removed: " + queue.offer(5));
		System.out.println("Queue: " + queue.peek());
		

		System.out.println("Queue after removel : " +queue.isEmpty());
		

	}

}
