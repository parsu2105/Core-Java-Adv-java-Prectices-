package com.kodewala;
import java.util.*;
public class EmployeByComparable {

	public static void main(String[] args) {
		List<Employees> EmpList = new ArrayList<>();
		
		EmpList.add(new Employees("PRASHANT", 700000));
		EmpList.add(new Employees("NISHANT", 812000));
		EmpList.add(new Employees("ISHANT", 34567));
		EmpList.add(new Employees("VISHAKHA", 34453));
		
		Collections.sort(EmpList, (p1, p2) -> {
			
			
			boolean even1 = p1.salary % 2 == 0;
			
			boolean even2 = p2.salary % 2 == 0;
			
			if(even1 && even2) return -1;
			
			if(!even1 && even2) return 1;
			if (p1.salary != p2.salary) return p2.salary - p1.salary;
			return p1.name.length() - p2.name.length();
		});
		
		System.out.println("THIS IS THE SORTED EMPLOYE NAME AND SALARY");
		for(Employees list : EmpList ) {
			System.out.println(list);
		}

	}

}
