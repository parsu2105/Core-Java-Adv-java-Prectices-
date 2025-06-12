package com.KodeWalaClassTest;

public class A extends Thread{
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("COUNT : " +i);
		}
	}
public static void main(String[] args) {
	A a1 = new A();
	a1.start();
	
	
	Alphabet a2 = new Alphabet();
	Thread s = new Thread(a2);
	s.start();
}
}

class Alphabet implements Runnable{
	public void run() {
		for(char i ='A' ; i <= 'E'; i++) {
			System.out.println(" AlphaBet : " + i);
		}
	}
}
