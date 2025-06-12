package com.KodeWalaClassTest;

public class ThreadDemo1 implements Runnable {

	public void run() {
		for(int i = 0 ; i<10 ; i++) {
		System.out.println("COUNT = " +i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
		Thread s1 = new Thread(t1);
		s1.start();

	}

}
