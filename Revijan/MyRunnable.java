package com.Revijan;

public class MyRunnable implements Runnable {
   public void run() {
	   for(int i = 1; i<=5; i++) {
		   System.out.println("RUNNABLE THREAD = " +i);
	   }
   }
   public static void main(String[] args) {
	MyRunnable s1 = new MyRunnable();
	Thread t1 = new Thread(s1);
	t1.start();
}
}


