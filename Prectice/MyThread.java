package com.Prectice;

class PrintNumbers{
	public synchronized void printTable(int n) throws InterruptedException{
		for(int i = 1; i <= 5; i++) {
			System.out.println(n + " X " + i + " = " +(n*i));
			Thread.sleep(400);
		}
	}
}

class MyThread1 extends Thread{
	PrintNumbers p;
	MyThread1(PrintNumbers p){
		this.p = p ;
	}
	
	public void run() {
		try {
			p.printTable(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class MyThread2 extends Thread{
	PrintNumbers p;
	MyThread2(PrintNumbers p ){
		this.p = p;
	}
	public void run() {
		try {
			p.printTable(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class MyThread extends Thread{
	
	public static void main(String[] args) throws InterruptedException{
		PrintNumbers obj = new PrintNumbers();
		MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t1.start();
	}

}

