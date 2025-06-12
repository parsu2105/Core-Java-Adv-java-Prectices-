package com.kodewala;

public class Employees {

	String name;
	int salary;
	
	public Employees(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "name: " + name +", salary: " + salary;
	}
}
