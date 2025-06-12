package com.kodewala;

public class BankAccount {

	static int balance;
		
		static void updateBalance(int balance1) {
			balance= balance1;
			
		}
		static void printBalnace() {
			System.out.println("THIS IS THE BALANCE OF THE STATIC METHOD "+balance);
		}
		
		public static void main(String[] args) {
		    BankAccount.updateBalance(5000000);
		    BankAccount.printBalnace();
		}

	}


