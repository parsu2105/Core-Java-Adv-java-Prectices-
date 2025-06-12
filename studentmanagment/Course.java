package studentmanagment;

import java.util.ArrayList;
import java.util.List;

public class UGStudent extends Student{
	public UGStudent(int id, String name, int marks) {
		super(id,name,marks);
	}
	
	@Override
	public void displayDetails() {
		System.out.println("undergraduate Student -> ID: " +getId() + ", Name: " +getName() + ", Marks: " +getMarks());
	}
}

class PGStudent extends Student{
	public PGStudent(int id,String name, int marks) {
		super(id,name,marks);
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Postgraduate student -> ID : " +getId() + ",Name: " +getMarks() );
	}
}

//Course Class
class Course {
	private String name;
	private int duration;
	
	public Course(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}
	
	public void displayCourse() {
		System.out.println("course : " +name + ", Duration : " +duration + "Months");
		
	}
}

class Collage {
	private List<Student> students = new ArrayList<>();
	private List<Course> courses = new ArrayList<>();
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	 public void displayCollegeDetails() {
	        System.out.println("\n----- College Details -----");
	        System.out.println("Students:");
	        for (Student student : students) {
	            student.displayDetails();
	        }

	        System.out.println("\nCourses:");
	        for (Course course : courses) {
	            course.displayCourse();
	        }

}
}
