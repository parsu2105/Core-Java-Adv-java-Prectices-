package com.Revijan;
class MySleepThreed extends Thread{
	
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			System.out.println(name +" Count    : " +i);
			
		}
	}
}
public class MainTreadException {

	public static void main(String[] args) {
		MySleepThreed s1 = new MySleepThreed();
		s1.start();
		s1.setName("MY THREAD....");

	}

}
