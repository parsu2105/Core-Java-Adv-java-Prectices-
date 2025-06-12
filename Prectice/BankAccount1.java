package com.Prectice;

public class BankAccount1 {
  private int balance;
  private String accountNumber;
   public BankAccount1(int bal, String accnt) {
	this.balance=bal;
	this.accountNumber=accnt;
}
	
	 public void setBalance(int a , String b) {
			balance=a;
			accountNumber=b;
		}
	public 	int  getBalance() {
			
			return balance;
		}
	
	public static void main(String[] args) {
		BankAccount1 s1 = new BankAccount1(0,"000000000");
		s1.setBalance(344555,"23456745");
		System.out.println(s1.getBalance());
		
	}

	}


