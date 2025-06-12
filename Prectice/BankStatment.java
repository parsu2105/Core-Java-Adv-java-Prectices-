package com.Prectice;
class Account{
	double balance;
	Account(double _balance){
		this.balance=_balance;
	}
	public void showBalance() {
		System.out.println("THIS IS THE ACCOUNT BALANCE="+balance);
	}
}

class SavingAccount extends Account{
	double interestRate;
	SavingAccount(double balance,double interestRate){
		super(balance);
		this.interestRate=interestRate;
	}
	
	public void calculateInterestRate() {
		double interest=balance*interestRate/100;
		System.out.println("THIS IS THE INTEREST RATE="+interest);
	}
}
class CurentAccount extends Account{
	CurentAccount(double balance){
		super(balance);
	}
	public void interstRate() {
		System.out.println("Sorry in the current Account there is no interest rate");
	}
	
}
public class BankStatment {

	public static void main(String[] args) {
	SavingAccount s1=new SavingAccount(100000,5);
	s1.showBalance();
	s1.calculateInterestRate();
	CurentAccount s2=new CurentAccount(400000);
	s2.showBalance();
	s2.interstRate();
	
	
	}

}
