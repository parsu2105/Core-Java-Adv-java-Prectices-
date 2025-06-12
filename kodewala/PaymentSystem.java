package com.kodewala;

interface Creditcard{
	default void pay(){
		System.out.println("THIS IS THE CREDIT CARD PAYMENT");
	}
}
interface Upi{
	default void pay() {
		System.out.println("this is the upi payment");
	}
}
class OnlinePayment implements Creditcard,Upi{
	public void pay() {
		System.out.println("THIS IS THE ONLINE PAYMENT");
		Creditcard.super.pay();
	}
}
public class PaymentSystem {

	public static void main(String[] args) {
		OnlinePayment onlinepaymet=new OnlinePayment();
		onlinepaymet.pay();
	}

}
