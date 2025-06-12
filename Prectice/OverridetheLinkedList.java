package com.Prectice;
import java.util.*;
class Employe1{
	String name;
	Employe1(String name){
		this.name = name;
	}
	@Override
	public int hashCode() {
		return 1234567;
	}

	
}
public class OverridetheLinkedList {

	public static void main(String[] args) {
		
		Set<Employe1> list = new HashSet<>();
		
		list.add(new Employe1("PRASHANT"));
		list.add(new Employe1("NISHANT"));
		list.add(new Employe1("ISHANT"));
		list.add(new Employe1("KUNDAN"));
		list.add(new Employe1("CHANDAN"));
		list.add(new Employe1("ANANT"));
		list.add(new Employe1("ANANTkumar"));
		list.add(new Employe1("ANANTkrishna"));
		list.add(new Employe1("ANANTsingh"));
		list.add(new Employe1("ANANTprakash"));
		
		
		Iterator<Employe1> itr = list.iterator();
		
		while(itr.hasNext()) {
			Employe1 emp = itr.next();
			System.out.println(emp.name);
		}
	}

}
