package com.KodeWalaClassTest;

public class ThreadDemo extends Thread {
	public static void main(String[] args) {
		ThreadDemo s1 = new ThreadDemo();
		s1.run();
		System.out.println("-----------------------------------------");
		ThreadDemo s2 = new ThreadDemo();
		s2.run();
	}

	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("Count : " + i + " -> " + Thread.currentThread().getName());
		}
	}
}


