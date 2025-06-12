package com.kodewala;

public class Table {
String name;
int  id;

public Table(String name, int id) {
	this.name = name;
	this.id = id;
}

public String toString() {
	return "TABLE NAME: " + name  +", ID: " + id ;
}
}
