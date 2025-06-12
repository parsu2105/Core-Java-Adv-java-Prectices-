package com.Revijan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
}

public class Mani {
	  public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("PRASHANT", 89),
				new Student("RAHUL",30),
				new Student("SITA",345)
				);
		List<String> topStudents = students.stream()
				                           .filter(n->n.marks>80)
										    .sorted(Comparator.comparing(s->s.name))
										    .map(s->s.name)
										    .collect(Collectors.toList());
		System.out.println(topStudents);
	}
}
