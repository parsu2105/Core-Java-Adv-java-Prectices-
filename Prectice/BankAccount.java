package com.Prectice;
class Bank1{
	private double balance;
	private String PIN;
	public Bank1(double _balance,String _PIN){
		this.balance=_balance;
		this.PIN=_PIN;
	}
	public double getBalance() {
		return balance;
	}
	public void deposite(int amount ,String PIN) {
		if(amount>0 && PIN.equals(PIN)) {
			balance+=amount;
			System.out.println("Your amount will be deposited"+amount);
		}
		else {
			System.out.println("SORRY YOU ARE PUTING INVALID AMOUNT");
		}
	}
	public void withDrow(int amount ,String PIN) {
		if(PIN.equals(PIN) && amount<=balance) {
			balance-=amount;
			System.out.println("YOUR amount will withdrow"+amount);
			System.out.println("YOUR Current Balance="+balance);
		}
		else {
			System.out.println("SORRY Invalid amount");
		}
	}
}
public class BankAccount {

	public static void main(String[] args) {
		Bank1 s1=new Bank1(1000,"1234");
		
		s1.deposite(1000, "1234");
		s1.withDrow(200, "1234");
		
		

	}

	

}
