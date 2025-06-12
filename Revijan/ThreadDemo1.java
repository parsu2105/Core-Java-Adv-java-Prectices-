package com.Revijan;

public class ThreadDemo1 extends Thread {
	public void run() {
		for(int i = 1; i<=5 ; i++) {
			System.out.println("THREAD = " +i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo1	 t1 = new ThreadDemo1();
		t1.start();
		
	}

}


