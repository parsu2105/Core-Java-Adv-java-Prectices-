package com.Prectice;

public class Person1 {
String name;
int age;
static int count=0;
Person1(){
	count++;
	System.out.println("NO DATA PROVIDED");
}
Person1(String name, int age) {
	
	this.name = name;
	this.age = age;
	count++;
	
}
void shoCount() {
	System.out.println(count);
}
public void displayInfo() {
	System.out.println("Name Of The Student ="+name);
	System.out.println("Age Of The Student  ="+age);
}
public static void main(String[] args) {
	Person1 s2 = new Person1();
	Person1 s1 = new Person1("PRASHANT KUMAR",35);
	Person1 s3 = new Person1("PRASHANT KUMAR",35);
	s3.shoCount();
	s1.displayInfo();
}
}
