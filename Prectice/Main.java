package com.Prectice;
class BankAccount11{
	private int balance;  //Private data(variable)
	BankAccount11(int _balance){
		this.balance=_balance;
	}
	public int  getBalance() {   //getterMethod
		return balance;
	}
	
	public void deposite(int amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("YOUR DEPOSITED AMOUNT="+amount);
		}
		else {
			System.out.println("INVALID AMOUNT");
		}
	}
	public void withdrow(int amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("WITHDROW="+amount);
		}
		else {
			System.out.println("Sorry invalid amount!");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		BankAccount11 bankAccount=new BankAccount11(1000);
		bankAccount.deposite(200);
		bankAccount.withdrow(500);
		System.out.println("YOUR BANKBALANCE REMAIN="+bankAccount.getBalance());

	}

}
