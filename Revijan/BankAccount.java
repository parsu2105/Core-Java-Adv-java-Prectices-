package com.Revijan;

public class BankAccount {
	
	String naam;
	int  balance = 100 ;
	
	String getNaam() {
		return naam;
	}
	int  getBalance() {
		return balance;
	}
	void withdrow(int amount) {
		if(amount > balance && amount != 0) {
			System.out.println("SORRY INSUFICIENT BALANCE");
		}else {
			balance -= amount;
			System.out.println(amount +"your withdrow is succesfull" + balance);
		}
	}
	
	void deposit(int amount) {
		if(balance != 0) {
			balance += amount;
			System.out.println(amount + "Your amount will deposite sucess fully" + balance);
		}
	}
	
	void setNaam(String name, int blance) {
		this.naam = name;
		this.balance = blance;
	}

	public static void main(String[] args) {
		BankAccount s1 = new BankAccount();
		s1.setNaam("PRASHANT", 12345);
		System.out.println(s1.getBalance());
		System.out.println(s1.getNaam());
		s1.deposit(2000);
		s1.withdrow(1000);

	}

}
