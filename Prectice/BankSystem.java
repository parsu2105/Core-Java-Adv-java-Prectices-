package com.Prectice;
class Account3{
	int balance;
	public Account3(int _balance) {
		this.balance=_balance;
	}
	public void showBalance() {
		System.out.println("THIS IS YOUR CURRENT BALANCE="+balance);
	}
}
class SavingAccount3 extends Account3{
	int interestRate;
	SavingAccount3(int _balance,int _interestRate){
		super(_balance);
		this.interestRate=_interestRate;
	}
	public void calculateInterest() {
		double interestOnBalance=balance*interestRate/100;
		System.out.println("THIS IS YOUR ACCOUNT BALANCE INTEREST="+interestOnBalance);
	}
}
public class BankSystem {

	public static void main(String[] args) {
		SavingAccount3 s1=new SavingAccount3(10000,5);
		s1.showBalance();
		s1.calculateInterest();

	}

}
