package com.Prectice;
interface BankService
{
	void deposit(int amount) ;	
}
interface LoanService
{
	void applyLoan(int amount);
}
 class PostAmount implements BankService,LoanService
{
	
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("this is your amount"+amount);
	}	
	
	public void applyLoan(int amount) {
		System.out.println("this is your Loan amount"+amount);
	}
}
public class VillageBank {

	public static void main(String[] args) {
		PostAmount s1=new PostAmount();
		s1.deposit(1000);
		s1.applyLoan(30);
	}

}


