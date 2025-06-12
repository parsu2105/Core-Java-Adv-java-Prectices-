package com.KodeWalaClassTest;

class School extends Thread {
	public void student() {
		System.out.println("Class is starting");
	}
	
	public static void m1() {
		System.out.println("-----------------------");
	}

	public synchronized void run() {
		student();
		m1();
	}
}

public class ExeptionPractice {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("SChool is open");
		School s1 = new School();
		s1.start();
		s1.start();
		s1.join();              // I (MAIN THREAD) WILL WAIT TILL YOU (T1 THREAD) FINISH YOUR WORK/TASK
		schoolTime();
		System.out.println("SCHOOL IS CLOSE");

	}

	public static void schoolTime() {
		System.out.println("Student are Present");
		System.out.println("LUNCH TIME");
		System.out.println("GAME PERIOD");
	}

}
