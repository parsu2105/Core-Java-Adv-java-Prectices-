package com.Revijan;
class MainThread1 extends Thread{
	String name = Thread.currentThread().getName();
	public void doSomething() {
		System.out.println("THIS IS DOSOMTHING ---> " + Thread.currentThread().getName());
	}
	public void workSomething() {
		System.out.println("THIS IS WORKSOMETHING ---> " + Thread.currentThread().getName());
	}
	
	public void iterator() {
		for(int i = 0; i <= 5; i++) {
			System.out.println(name +" Count : " +i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(" EXCEPTION ");
			}
		}
	}
	
	public void run() {
		doSomething();	
		iterator();
	}
	
	
	
}
public class MainTest {

	public static void main(String[] args) {
       MainThread1 s1 = new MainThread1();
       
		
		s1.start();
		
		System.out.println("--------------");
		s1.workSomething();
		
		System.out.println("-------------Main Thread-----------------");
		MainThread1 s2 = new MainThread1();
		
		s2.start();
		System.out.println("---------------------------------->");
		s2.workSomething();
		
	}

}
