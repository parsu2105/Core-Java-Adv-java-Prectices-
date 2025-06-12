package com.Prectice;

 class AtmSystem {
private String PIN="1234";
private double balance=1000;
public void deposit(String atmPin,double amount) {
	System.out.println("THIS IS YOUR CURRENT ACCOUNT BALANCE"+balance);
	if(atmPin.equals(PIN) && amount>0) {
		if(true) {
		balance+=amount;
		System.out.println("your cash has been deposited");
		}
		System.out.println("THIS IS YOUR ACCOUNT BALANCE="+balance);
	}
	else {
		System.out.println("YOU HAVE INVALID AMOUNT!");
	}
}
public void withdrow(String atmPin,double amount){
	System.out.println("THIS IS YOUR CURRENT BALANCE="+amount);
	if(atmPin.equals(PIN) && amount<=balance) {
		balance-=amount;
		System.out.println("YOU ARE SUCCES FULLY WITHDROW YOU AMOUNT ="+amount);
	}
	else {
		System.out.println("INSAFISEANT BALANCE");
	}
}

}
public class ATM{
public static void main(String[] args) {
	AtmSystem s1=new AtmSystem();
	s1.deposit("1234",1000);
	s1.withdrow("1234",100 );
}
}

