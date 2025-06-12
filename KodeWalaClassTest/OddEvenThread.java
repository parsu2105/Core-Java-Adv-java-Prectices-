package com.KodeWalaClassTest;

class Printer {
	boolean isOdd = true;

	public synchronized void printOdd(int number) throws InterruptedException {
		while (!isOdd) {
			wait();
		}
		System.out.println("Odd: " + number);
		isOdd = false;
		notify();
	}

	public synchronized void printEven(int number) throws InterruptedException {
		while (isOdd) {
			wait();
		}
		System.out.println("Even: " + number);
		isOdd = true;
		notify();
	}
}

class OddThread extends Thread {
	Printer printer;

	OddThread(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				printer.printOdd(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class OddEvenThread extends Thread {
	Printer printer;

	OddEvenThread(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		for (int i = 2; i <= 10; i += 2) {
			try {
				printer.printEven(i);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Printer Printer = new Printer();
		new OddThread(Printer).start();
		new OddEvenThread(Printer).start();
	}

}
