package com.Revijan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;






 class Student11 {
	String name;
	 int marks;
 Student11(String name, int marks){
	 this.name = name;
	 this.marks = marks;
 }
}

class StudentClass{
	public static void main(String[] args) {
		List<Student11> list = Arrays.asList(
				new Student11("Prashant",400),
				new Student11("Nishant",424),
				new Student11("Ujwal",234),
				new Student11("Pankaj",405),
				new Student11("Mihir",103),
				new Student11("Amit",600)
				);
		
		List<String> s1 =list.stream().
				filter(n->n.marks>80)
				.sorted(Comparator.comparingInt((Student11 n)->n.marks).reversed())
				.map(n->n.name)
				.collect(Collectors.toList());
		System.out.println(s1);
		
		List<Integer> s2 = list.stream().
				filter(n->n.marks>80)
				.sorted(Comparator.comparingInt((Student11 n)->n.marks).reversed())
				.map(n->n.marks)
				.collect(Collectors.toList());
		System.out.println(s2);
	}
	
}
