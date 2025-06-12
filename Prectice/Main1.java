package com.Prectice;
class Bank{
	private double balance;
	public Bank(double _balance){
		this.balance=_balance;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposite(int amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("this is your deposite amount"+amount);
		}
		else {
			System.out.println("INVALID AMOUNT!");
		}
	}
	
	public void withDrow(int amount) {
		if(amount>0 && amount<=balance)
		{
			balance-=amount;
			System.out.println("YOUR WITHRDROW AMOUNT IS="+amount);
		}
		else {
			System.out.println("you have insuficeant fund in your account");
		}
	}
}
public class Main1 {

	public static void main(String[] args) {
		Bank s1=new Bank(1000);
		s1.deposite(100);
		s1.withDrow(399);
		System.out.println("this is your balance remain in your account="+s1.getBalance());
	}

}
