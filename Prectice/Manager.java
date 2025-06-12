package com.Prectice;
class Employe{
	String name;
	Employe(String _name){
		this.name=_name;
		System.out.println(name+" ,"+"IS A EMPLOYE");
	}
}
public class Manager extends EmployeL {
	String department;
	Manager(String _name,String _department){
		super();
		this.department=_department;
		System.out.println("IS A MANAGER ="+_name +" ,"+"Department="+department);
	}

	public static void main(String[] args) {
		Manager m1=new Manager("PRASHANT","IT");

	}

}
