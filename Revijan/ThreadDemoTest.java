package com.Revijan;

public class ThreadDemoTest extends Thread{
	String name = Thread.currentThread().getName();
	public static void main(String[] args) {
	 ThreadDemoTest s1 = new ThreadDemoTest();
	 s1.setName("Hello World");
	 s1.start();
	}
	@Override
	public void run() {
		
		System.out.println("HELLO WORLD ------------------  "+Thread.currentThread().getId());
		for(int i = 1; i<=5; i++) {
			System.out.println(name +" Count: " + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("HANDALE THREAD");
			}
		}
	}

}
