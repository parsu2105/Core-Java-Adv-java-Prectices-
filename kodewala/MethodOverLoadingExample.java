package com.kodewala;

class Registation{
	void doRegistation(String aadhar) {
		System.out.println("Registation using aadhar"+aadhar);
	}

	void doRegistation(String name,int phoneNo) {
		System.out.println("THIS IS THE REGISTATION THROW NAME AND PHONE NUMBER="+name+phoneNo);
	}
	
	void doRegistation(int otp,int phoneNo) {
		System.out.println("THIS IS THE REGISTATION THROW NAME AND PHONE NUMBER="+otp+phoneNo);
	}
}

 
public class MethodOverLoadingExample {

	public static void main(String[] args) {
		Registation s1=new Registation();
		s1.doRegistation("PRASHANT KUMAR");
		s1.doRegistation("prashant Kumar", 12345678);
		s1.doRegistation(123, 23456786);
	}

}
