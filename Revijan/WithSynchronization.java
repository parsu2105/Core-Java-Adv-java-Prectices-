package com.Revijan;

class BankAccount11{
	int balance = 10000;

	// Synchronized Method
	synchronized void withdraw(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining: " + balance);
		} else {
			System.out.println(Thread.currentThread().getName() + "-Insufficient Balance");
		}
	}
}

class Customer extends Thread {
	BankAccount11 acc;
	int amount;

	Customer(BankAccount11 acc, int amount, String name) {
		super(name);
		this.acc = acc;
		this.amount = amount;
	}
	public void run() {
		acc.withdraw(amount);
	}

}

	

public class WithSynchronization {

	public static void main(String[] args) {
		BankAccount11 acc = new BankAccount11();
		Customer t1 = new Customer(acc,700,"Ram");
		Customer t2 = new Customer(acc,600,"Shyam");
		t1.start();
		t2.start();

	}
	

}
