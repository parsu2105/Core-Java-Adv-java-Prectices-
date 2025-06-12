package mybasicpractice;

public class BankAccount {
	private int accountNumber;
	private int balance;
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setBallance(int balance) {
		if(balance>0) this.balance = balance;
	}
	public int getBallance() {
		return balance;
	}
	
	public void deposit(int amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("YOUR AMOUNT IS DEPOSITED " +amount);
		}
	}
	
	public void withdrow(int amount) {
		if(amount>0 && amount<balance) {
			balance -= amount;
			System.out.println("THIS IS YOUR CURRENT BALANCE = " +balance);
		}
	}
	public static void main(String[] args) {
		BankAccount s1 = new BankAccount();
		s1.deposit(5000);
		s1.withdrow(4000);

	}

}
