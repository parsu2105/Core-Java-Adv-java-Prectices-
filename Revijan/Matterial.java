package com.Revijan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class  Product{
String name;
double price;
Product(String name, double price){
	this.name = name;
	this.price = price;
}
}
public class Matterial{
	public static void main(String[] args) {
		List<Product> list = Arrays.asList(
				new Product("Parle-G", 200),
				new Product("Book",300),
				new Product("Pen",30),
				new Product("Laptop",50000),
				new Product("Tab", 4000),
				new Product("Phone",30000)
				);
		
	List<Double> s1 = list.stream().filter(n->n.price<1000).map(n->n.price+100/10).collect(Collectors.toList());
	System.out.println(s1);
	}
}
