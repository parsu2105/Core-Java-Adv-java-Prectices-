package com.kodewala;
import java.util.*;
public class CustomArrayListSort1 {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		
		productList.add(new Product("BOOK", 1123));
		productList.add(new Product("PEN", 134));
		productList.add(new Product("LAPTOP", 235));
		productList.add(new Product("PANT", 4198));
		
		Collections.sort(productList);
		
		System.out.println("YOUR SORTED PRODUCT WITH RESPECT TO ID");
		for(Product s : productList) {
			System.out.println(s);
		}
	}

}
