package com.kodewala;
import java.util.*;
class CustomArrayListExample {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("PRASHANT",103));
		students.add(new Student("NISHANT",102));
		students.add(new Student("ISHANT",106));
		students.add(new Student("VISHAKHA",104));
		
		Collections.sort(students);
		
		
		System.out.println("STUDNETS LIST");
		for(Student s : students) {
			System.out.println(s);
		}

	}

}
