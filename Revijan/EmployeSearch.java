package com.Revijan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 class Employe{
String name;
int salary;

Employe(String name, int salary){
	this.name = name;
	this.salary = salary;
}
}
class EmployeSearch{
	public static void main(String[] args) {
		List<Employe> list = Arrays.asList(
				new Employe("Prashant",650),
				new Employe("Nishant",400000),
				new Employe("Vikcy",300000),
				new Employe("Ashish",500000)

				);
	List<String> a=	list.stream().filter(n->n.salary>50000).map(n->n.name).collect(Collectors.toList());
	System.out.println(a);
	}
}
