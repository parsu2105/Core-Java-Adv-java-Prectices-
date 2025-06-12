package com.Prectice;
 interface Animall {
    void Account();
    void SavingAccount();
    void CurrentAccount(); // Corrected method name

}
class Doge implements Animall {
    public void Account() {
        System.out.println("Woof! Woof!");
    }

    public void SavingAccount() {
        System.out.println("THIS IS THE SAVING ACCOUNT");
    }

    public void CurrentAccount() { // Corrected method name
        System.out.println("THIS IS THE CURRENT ACCOUNT");
    }
}

class Main3 {
    public static void main(String[] args) { // Corrected main method
        Doge s1 = new Doge();
        s1.Account();
        s1.SavingAccount();
        s1.CurrentAccount(); // Corrected method name
    }
}

