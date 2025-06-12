package com.kodewalaDependence;

public class Main {

	public static void main(String[] args) {
		Game gam = new Game("KABADI", "KHOKHO", "CRICKET", "GULIDANTA");
		Address adres = new Address("BTM", "SECOND STAGE - 2 ", "56065", "BANGLORE", "INDIA", gam);
		
		Employe s1 = new Employe("PRASHANT", "100000", "MANOJ KUMAR", "RUMA KUMARI",adres);
		
		
		System.out.println(s1.makeRead());
	}

}
