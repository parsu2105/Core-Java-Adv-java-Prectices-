package com.kodewala;

class BankDetail{
	void Detail() {
		System.out.println("WHAT IS YOUR NAME");
		System.out.println("What is the phone number");
		System.out.println("What is the Address");
	}
}
class SavingAccount extends BankDetail{
	
	void savingAccount(){
	System.out.println("What is Your Account Type");
	System.out.println("what is your phone number");
	}

}

public class HierarchicalInheritance extends BankDetail{

	public static void main(String[] args) {
		System.out.println("--------------this is the Hierarchical inheritance-------------");
		HierarchicalInheritance s1=new HierarchicalInheritance();
		SavingAccount savingaccount =new SavingAccount();
		savingaccount.savingAccount();
		s1.Detail();
		System.out.println("---------------------------------------------------");
		
	}

}
