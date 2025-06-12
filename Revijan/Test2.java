package com.Revijan;
abstract class Vehicle{
	abstract void startEngine();
}
class Car1 extends Vehiclee{
	void startEngine() {
		System.out.println("THIS IS THE CAR ENGINE");
	}
}
class Bike1 extends Vehiclee{
	void startEngine() {
		System.out.println("THIS IS THE BIKE ENGINE");
	}
}
public class Test2{
	public static void main(String[] args) {
		
		Vehiclee s1 = new Car1();
		s1.startEngine();
		
		Vehiclee s2 = new Bike1();
		s2.startEngine();
		
		Playable s3 = new Football();
		s3.playGame();
		
		Playable s4 = new Cricket();
		s4.playGame();
		
		Animall s5 = new Dogg();
		s5.makeSound();
		
		Moveable s6 = new Dogg();
		s6.move();
		
	}
}


interface Playable{
	void playGame();
}

class Football implements Playable{
	public void playGame(){
		System.out.println(" THIS IS THE FOOT BALL GAME ");
	}
}
class Cricket implements Playable{
	public void playGame() {
		System.out.println("THIS IS THE CRICKET GAME");
	}
}


class AgeOfVoter extends Exception{
	AgeOfVoter(String name){
		super(name);
	}
}
class CheckVoterAge {
	static void checkAge(int age) throws AgeOfVoter{
		if(age<18) {
			throw new AgeOfVoter("YOU ARE NOT ELEIGBLE");
		}else {
			System.out.println("YOU ARE ELEGIBLE");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(34);
		}catch(AgeOfVoter e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("THIS WILL EXecute hundred percent");
		}
	}
}


interface Moveable {
	void move();
}
abstract class Animall{
	abstract void  makeSound();
}
class Dogg extends Animall implements Moveable{
public void move() {
		System.out.println("THIS IS THE MOVEABLE METHOD");
	}
	void makeSound() {
		System.out.println("THIS IS DOG SOUND");
	}
}


class InvalidTransportException extends  Exception{
	public InvalidTransportException(String s) {
		super(s);
	}
}

abstract class Transport{
	void start() {
		System.out.println("START THE TRANSPORT");
	}
	abstract void move();
}

interface Flyable {
	void fly();
}

interface Swimmable{
	void swim();
}

class Aeroplane extends Transport implements Flyable{

	@Override
	public void fly() {
		System.out.println("THIS WILL FLY ");
		
	}

	@Override
	void move() {
		System.out.println("THIS WILL MOVE");
		
	}
	
}
class Boat extends Transport implements Swimmable{

	@Override
	public void swim() {
		System.out.println("THIS WILL SWIM");
		
	}

	@Override
	void move() {
		System.out.println("THIS WILL MOVE");
		
	}
	
}
class Duck extends Transport implements Flyable{

	@Override
	public void fly() {
		System.out.println("THIS WILL FLY");
		
	}

	@Override
	void move() {
		System.out.println("THIS WILL MOVE");
		
	}
	
}






















