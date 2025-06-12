package com.kodewala;

public class Student implements Comparable<Student> {
	String name;
	int rollNo;
	
	public Student(String name, int rollNo) {
		this.name = name;
		
		this.rollNo = rollNo;
	}
	
	public int compareTo(Student other) {
		return this.rollNo - other.rollNo;
	}
	
	public String toString() {
		return "NAME: "  + name + ", Roll No " + rollNo;
	}
}
