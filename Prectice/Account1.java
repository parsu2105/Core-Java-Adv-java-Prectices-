package com.Prectice;

abstract public class Account1 {
	double balance;

	Account1(double balance) {
		this.balance = balance;
	}

	abstract void calculateInterest();
}

class SavingAccount1 extends Account1 {
	int interestRate;

	SavingAccount1(double _balance, int _interestRate) {
		super(_balance);
		this.interestRate = _interestRate;
	}
    
	public void calculateInterest() {
		double interest = balance * interestRate / 100;
		System.out.println("THIS IS YOUR INTEREST RATE=" + interest);
		System.out.println("THIS IS YOUR BALANCE=" + balance);
	}
}

class CurrentAccount extends Account1 {
	CurrentAccount(double balance) {
		super(balance);
	}

	public void calculateInterest() {
		System.out.println("YOUR ACCOUNT BALANCE IS=" + balance);
		System.out.println("no interest Ablable for Current Account");
	}
}

class Bankstament {
	public static void main(String[] args) {
		Account1 s1 = new SavingAccount1(100000, 5);
		s1.calculateInterest();
		Account1 s2 = new CurrentAccount(200000);
		s2.calculateInterest();

	}
}
