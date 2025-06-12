package com.kodewala;

interface CreditCardPayment{
	default void pay(){
		System.out.println("THIS IS THE CREDIT CARD PAYMENT");
	}
}
interface UPIPayment{
	default void pay() {
		System.out.println("this is the upi payment");
	}
}
class OnlinePayment1 implements CreditCardPayment, UPIPayment {
    public void pay(String method) {
        if (method.equalsIgnoreCase("credit")) {
            CreditCardPayment.super.pay();
        } else if (method.equalsIgnoreCase("upi")) {
            UPIPayment.super.pay();
        } else {
            System.out.println("Invalid payment method selected!");
        }
    }

	
	public void pay() {
		// TODO Auto-generated method stub
		CreditCardPayment.super.pay();
	}
}
public class UserInputPaymetSystem {
    public static void main(String[] args) {
        OnlinePayment1 payment = new OnlinePayment1();
        payment.pay(); // Processing payment via UPI...
    }
}