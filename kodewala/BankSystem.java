package com.kodewala;
class Accoun{
	double balance;
	
	public Accoun(double balance) {
		this.balance=balance;
	}
	public void showbalance() {
		System.out.println("Account Balance:"+balance);
	}
}

class SavingAcount extends Accoun{
	double interestRate;
	SavingAcount(double balance,double _interestRate){
		super(balance);
		this.interestRate=_interestRate;
	}
	
	public void calculateInterest() {
		double interest=balance*interestRate/100;
		System.out.println("INTEREST EARNED:"+interest);
	}
}
public class BankSystem {

	public static void main(String[] args) {
		SavingAcount s1=new SavingAcount(100000,5);
		s1.showbalance();
		s1.calculateInterest();

	}

}
