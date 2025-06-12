package com.Revijan;

interface Vehical1{
public abstract	void start();
}
interface Machine{
	void stop();
}
class Car implements Vehical1,Machine{
	public void start() {
		System.out.println("CAR START");
	}
	
	public void stop() {
		System.out.println("CAR STOP");
	}
}
public class Test1 {

	public static void main(String[] args) {
		Car s2 = new Car();
		s2.start();
		s2.stop();
	}

}
