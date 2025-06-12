package com.Revijan;

public class BankAccount1 {
   int balance;
   void deposit(int amount) {
	   balance += amount;
   }
   void withdraw(int amount) {
	   balance -= amount;
   }
   
   public static void main(String[] args) {
	   BankAccount1 s = new BankAccount1();
	   s.deposit(10000);
	   s.withdraw(2000);
	SavingAccount s1 = new SavingAccount();
	s1.interestRat(10000);
	CurrentAccount s2 = new CurrentAccount();
	s2.interestRat();
}
}
class SavingAccount extends BankAccount1{
	void interestRat(int amount) {
		int interestRate = balance+amount * 100;
		System.out.println("YOUR INTEREST RATE IS -> " +interestRate);
	}
}
class CurrentAccount extends BankAccount1{
	void interestRat() {
		System.out.println("SORRY WE NOT GIVE INTEREST IN THE CURRENT ACCOUNT");
	}
}