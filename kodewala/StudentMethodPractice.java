package com.kodewala;

public class StudentMethodPractice {

	
		String name;
		int age;
		char grad;
		
		public void displayStudnetInfo(String name1) {
			name= name1;
			System.out.println("STUDENT NAME ="+name);
		}
		public void displayStudentInfo(int age1) {
			age = age1;
			System.out.println(age);
		}
		public void displayStudentInfo(char a) {
			grad = a;
			System.out.println(grad);
		}
	public static void main(String[] args) {
		StudentMethodPractice s1 = new StudentMethodPractice();
		s1.displayStudnetInfo("PRASHANT KUMAR");
		s1.displayStudentInfo(20);
		s1.displayStudentInfo('A');
	}

}
