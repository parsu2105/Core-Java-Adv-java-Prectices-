package com.Revijan;
class MyThread extends Thread{
	public void start() {
		super.start();
		System.out.println("Start Method");
	}
	public void run() {
		System.out.println("RUN METHOD");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread s1 = new MyThread();
		s1.start();
		System.out.println("Main Thread");
		

	}

}
