package com.KodeWalaClassTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		
		//--------------THIS IS TO FIND THE EVEN NUMBER-----------------
		List<Integer> list = Arrays.asList(2,3,45,5,78,5,77,56,7,46,6);
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		List<Integer> evenList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		//-----------------------THIS IS THE EMPLOYE CLASS CODE---------------------------------------
		List<Employee> employee = Arrays.asList(
				new Employee("ALICE","HR"),
				new Employee("BOB","IT"),
				new Employee("CHARLIE","HR"),
				new Employee("David","IT"),
				new Employee("EVE","FINANCE")
				); 
		
		Map<String, List<Employee>> groupedByDept = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		groupedByDept.forEach((dept,empList)->{
			System.out.println(dept + ": " +empList);
		});
		
		//--------------------------------THIS IS THE Squared of the List----------------------------------------
		List<Integer> list1 = Arrays.asList(1,2,4,5,6,7,8);
		list1.stream().map(n->n*n).forEach(System.out::println);
		
		//---------------------------------Filter THE NAME STARTED WITH "A"-------------------------------------
		List<String> list2 = Arrays.asList("PRASHANT","NISHANT","ANKITA","ANAMIKA","AMAN","ANUSHKA","VISHAKHA","NANINA");
		list2.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
		
		
		//----------------------------------Duplicate and UNIC ELEMENTS-----------------------------------------
		List<Integer> list3 = Arrays.asList(1,2,3,4,3,2,34,56,7,5,4,3,23,2);
		list3.stream().map(n->n).collect(Collectors.toSet()).forEach(System.out::println);;
		
		
		//---------------------------------FREQUENCE COUNTING CODE-----------------------------------------------
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
		Map<String, Long> freq = words.stream().collect(Collectors.groupingBy(word->word,Collectors.counting()));
		freq.forEach((word,count)->System.out.println(word +": " +count));

		//----------------------------------REPETED CHARACHTER----------------------------------------------------
//		List<String> cities = Arrays.asList("Mumbai","Delhi","Pune","Chennai");
//		Set<Character> seen = new HashSet<Character>();
//		for(Character city : cities) {
//			city = city.toLowerCase();
//			for(char ch : city.toCharArray()) {
//				
//			}
//		}
//		
		
		
		
		
		
	}

}

class Employee{
	private String name;
	private String department;
	Employee(String name, String department){
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String toString() {
		return name;
	}
	
}
