package com.Revijan;

public class ThreadDemo2 extends Thread {

	public static void main(String[] args) {
		ThreadDemo2 t1 = new ThreadDemo2();
		t1.setName("MY-THREAD");
		t1.start();
	}

	public void run() {
		System.out.println("THIS IS THE THREAD");
		countingNum();
		findOddNum();

	}

	public void countingNum() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i <= 4; i++) {
			System.out.println(name + " Count : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("HANDLING THREAD EXCEPTION");
			}
		}
	}

	public void findOddNum() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);

				if (i % 2 == 0) {
					System.out.println(i);
				} else {
					continue;
				}
			} catch (Exception e) {
				System.out.println(" THIS IS THE EXCEPTION ");
			}
		}
	}
}
