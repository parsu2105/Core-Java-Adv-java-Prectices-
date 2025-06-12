package com.kodewala;

public class Account{
    public static void main(String[] args) {
        int[][] accounts = { {1, 5}, {7, 3}, {3, 5} };
        System.out.println("Richest Customer's Wealth: " + findRichest(accounts));
    }

    static int findRichest(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) { // Iterating over each customer
            int wealth = 0;
            for (int money : customer) { // Summing up wealth of a customer
                wealth += money;
            }
            maxWealth = Math.max(maxWealth, wealth); // Update max wealth
        }
        return maxWealth;
    }
}

