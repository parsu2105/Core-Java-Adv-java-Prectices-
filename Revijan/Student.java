package com.Revijan;

public class Student {

	private String name;
	private String rollNo;
	private String marks;
	String getName() {
		return name;
		
	}
	String  getRollNo() {
		return rollNo;
	}
	String getMarks() {
		return marks;
	}
      void setStudentDtail(String name,String roll,String marks) {
		this.name = name;
		this.rollNo = roll;
		this.marks = marks;
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentDtail("PRASHANT", "1234","345");
        System.out.println("This Is your Name =" + s1.getName());
        System.out.println("YOUR ROLL NO =" + s1.getRollNo());
        System.out.println();
	}

}
