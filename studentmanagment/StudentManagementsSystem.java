package studentmanagment;

public class StudentManagementsSystem {

	public static void main(String[] args) {
		College college = new College();

        // Adding Students
        college.addStudent(new UGStudent(101, "Alice", 89.5));
        college.addStudent(new PGStudent(102, "Bob", 92.3));

        // Adding Courses
        college.addCourse(new Course("Computer Science", 24));
        college.addCourse(new Course("Data Science", 12));

        // Displaying college details
        college.displayCollegeDetails();


	}

}
