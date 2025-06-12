package com.kodewala;

public class ProductStore {
String name;
int id;

public ProductStore(String name, int id) {
	this.name = name;
	this.id = id;
}

public String toString() {
	return "Product Name : " +name +", Id :" +id ;
}
}
