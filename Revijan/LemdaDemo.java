package com.Revijan;

public class LemdaDemo extends Thread{
    public void run() {
    	System.out.println("HELLO Form MY THREAD");
    }
	public static void main(String[] args) {
		
		System.out.println("HELLO "+currentThread().getName());
		Thread s1 = new Thread(new LemdaDemo());
		
		s1.start();
		System.out.println("THREAD END");
	

}
}
