package com.Prectice;
class Bank2{
	private int balance=1000;
	private String pin="1234";
	
	public void deposite(String enterPin,int amount) {
		System.out.println("THIS IS YOUR CURRENT BALANCE="+balance);
		if(enterPin.equals(pin)) {
			balance+=amount;
			System.out.println("YOUR CURRENT BALANCE AFTER DEPOSITE ="+balance);
		}
		else {
			System.out.println("YOU have incorrect Pin!");
		}
	}
	public void withDrow(String enterPin,int amount) {
		
		if(enterPin.equals(pin) && amount<=balance) {
			
			balance-=amount;
			System.out.println("YOUR Account Balnce After Withdrow ="+balance);
		}
		else {
			System.out.println("INVALID BALANCE");
		}
	}
	
}
public class Main2 {

	public static void main(String[] args) {
		Bank2 s1=new Bank2();
		s1.deposite("1234",1234);
		s1.withDrow("1234",500);
		

	}

}
