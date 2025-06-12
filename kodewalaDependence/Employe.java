package com.kodewalaDependence;

 class Employe {
private String name;
private String salary;
private String fatherName;
private String motherName;
private Address address;
public Employe(String name, String salary, String fatherName, String motherName, Address address) {
	
	this.name = name;
	this.salary = salary;
	this.fatherName = fatherName;
	this.motherName = motherName;
	this.address = address;
}
public Address getAddress() {
	return address;
}
public String getName() {
	return name;
}
public String getSalary() {
	return salary;
}
public String getFatherName() {
	return fatherName;
}
public String getMotherName() {
	return motherName;
}

public String makeRead() {
	return "NAME = "+name + ", SALRY = " +salary + ", FATHER NAME = " + fatherName + ", MOTHER NAME = " + motherName +", ADDRESS = " + address;
}

}
