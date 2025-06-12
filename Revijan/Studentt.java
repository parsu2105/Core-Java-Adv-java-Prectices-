package com.Revijan;
public class Studentt {

    private String name;
    private String rollNo;
    private int marks;

    // Getter methods
    String getName() {
        return name;
    }

    String getRollNo() {
        return rollNo;
    }

    int getMarks() {
        return marks;
    }

    // Setter method
    void setStudentDetail(String name, String rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Display method (as per earlier question)
    void displayStudentInfo() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks   : " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentDetail("PRASHANT", "1234", 345);
        s1.displayStudentInfo();
    }
}
