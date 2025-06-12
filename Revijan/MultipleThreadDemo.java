package com.Revijan;

class MySleepThread extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i = 1; i <= 3; i++) {
			System.out.println(name + "- Count: " +i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Interrupted");
			}
		}
	}
}

public class MultipleThreadDemo {
public static void main(String[] args) {
	MySleepThread t1 = new MySleepThread();
	MySleepThread t2 = new MySleepThread();
	t1.setName(" MUSICTHREAD ");
	t2.setName("DOWNLORDINGTHREAD");
	t1.start();
	t2.start();
}
}
