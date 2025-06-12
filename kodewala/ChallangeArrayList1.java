package com.kodewala;
import java.util.*;
public class ChallangeArrayList1 {

	public static void main(String[] args) {
		List<ProductStore> listOfProduct = new ArrayList<>();
		
		listOfProduct.add(new ProductStore("PANT", 412));
		listOfProduct.add(new ProductStore("Shirt", 912));
		listOfProduct.add(new ProductStore("T-SHIRT", 412));
		listOfProduct.add(new ProductStore("UNDERBEAR", 712));
		listOfProduct.add(new ProductStore("COCOKOLA", 512));
		listOfProduct.add(new ProductStore("BEAR", 124));
		listOfProduct.add(new ProductStore("BED", 712));
		listOfProduct.add(new ProductStore("ALMARI",  912));
		
		
		Collections.sort(listOfProduct, new Comparator<ProductStore>() {
			public int compare(ProductStore p1, ProductStore p2) {
				return p1.name.compareTo(p2.name);
			}
		});
		
		System.out.println("Sorted By Product Name:");
		for(ProductStore s1 : listOfProduct) {
			System.out.println(s1);
		}
		

	}

}
