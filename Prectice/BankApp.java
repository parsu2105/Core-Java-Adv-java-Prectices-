package com.Prectice;
interface BankSystem1 {
    public static final double MIN_BALANCE = 100.00;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double checkBalance();
}

// Concrete class for Savings Account
class SavingAccounte implements BankSystem1 {
    protected double balance;

    public SavingAccounte(double amount) {
        this.balance = amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("YOUR DEPOSIT AMOUNT = " + amount + ", YOUR TOTAL ACCOUNT BALANCE = " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("YOUR WITHDRAW AMOUNT = " + amount + ", YOUR REMAINING BALANCE = " + balance);
        } else {
            System.out.println("INSUFFICIENT FUNDS");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

// Concrete class for Current Account
class CurrentAccount1 implements BankSystem1 {
    protected double balance;

    public CurrentAccount1(double amount) {
        this.balance = amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("YOUR DEPOSIT AMOUNT = " + amount + ", YOUR TOTAL ACCOUNT BALANCE = " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("YOUR WITHDRAW AMOUNT = " + amount + ", YOUR REMAINING BALANCE = " + balance);
        } else {
            System.out.println("INSUFFICIENT FUNDS");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {
        BankSystem1 s1 = new SavingAccounte(5000);
        s1.deposit(3000);
        s1.withdraw(2500);
        System.out.println("Final Balance in Savings Account: " + s1.checkBalance());

        BankSystem1 s2 = new CurrentAccount1(4000);
        s2.deposit(3000);
        s2.withdraw(3400);
        System.out.println("Final Balance in Current Account: " + s2.checkBalance());
    }
}
