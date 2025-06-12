package com.Revijan;
interface Worker{
	void calculateSalary();
	void showDetails();
}
class Manager implements Worker{
	public void calculateSalary(){
		System.out.println("THIS IS MY SALARY");
	}

	@Override
	public void showDetails() {
		System.out.println("THIS IS MY PERSONAL DETAIL");
		
	}
}
class Devolper implements Worker{

	@Override
	public void calculateSalary() {
		System.out.println("THIS IS DEVLOPER SALARY");
		
	}

	@Override
	public void showDetails() {
		System.out.println("THIS IS THE DEVLOPER DETAIL");
		
	}
	
}
public class Employeee {
public static void main(String[] args) {
	Manager s1 = new Manager();
	s1.calculateSalary();
	s1.showDetails();
	Devolper s2 = new Devolper();
	s2.showDetails();
	s2.calculateSalary();
}
}
