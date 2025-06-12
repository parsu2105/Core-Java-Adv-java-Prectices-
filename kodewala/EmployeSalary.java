package com.kodewala;
class Employe{
	public  void salary() {
		System.out.println("this is the your salary");
	}
}
class Manager extends Employe{
	public void salary() {
		System.out.println("this is the manger salary");
	}
}
class Devloper extends Employe{
	public void salary() {
		System.out.println("This is the Devloper salary");
	}
}
public class EmployeSalary {

	public static void main(String[] args) {
		Employe employe=new Devloper();
		employe.salary();
		

	}

}
