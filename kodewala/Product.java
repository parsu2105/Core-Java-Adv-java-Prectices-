package com.kodewala;

public class Product implements Comparable<Product> {
  String name;
  int id;
  
  public Product(String name, int id) {
	  this.name = name;
	  this.id = id;
  }
  
  public int compareTo(Product other) {
	  return this.id - other.id;
  }
  
  public String toString() {
	  return "Product Name: " + name + ", ID: " + id ;
  }
}
