package mybasicpractice;

class Vehicle{
	void start() {
		System.out.println("VEHICLE START");
	}
}
class Car1 extends Vehicle{
	void start() {
		System.out.println("CAR START WITH KEY");
	}
}
class Bike extends Vehicle {
	void start() {
		System.out.println("BIKE START WITH KICK");
	}
}



public class InheritancePractice {

	public static void main(String[] args) {
		Vehicle s1 = new Car1();
		s1.start();
		Vehicle s2 = new Bike();
		s2.start();

	}

}
