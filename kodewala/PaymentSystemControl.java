package com.kodewala;

class Payment1{
	void processPayment(double amount) {
		System.out.println("Processing generic payment of "+amount);
	}
}
class UPIPayment1 extends Payment1{
	
	void processPayment(double amount) {
		System.out.println("Process Upi Payment="+amount);
	}
}
class CreditCardPayment1 extends Payment1{
	
	void processPayment(double amount) {
		System.out.println("Process of CreditCard Payment="+amount);
	}
}
public class PaymentSystemControl {

	public static void main(String[] args) {
		Payment1 payment;
		payment=new UPIPayment1();
		payment.processPayment(3445.33);
		 payment=new CreditCardPayment1();
		payment.processPayment(2345.32);

	}

}
