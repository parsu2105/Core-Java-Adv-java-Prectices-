package com.Prectice;
import java.util.*;
public class GrocerListWithArrayList {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		
		fruits.add("APPLE");
		fruits.add("ORGANGE");
		fruits.add("GRAPES");
		fruits.add("BANANA");
		fruits.add("CHICKU");
		
		List<String> vegitable = new ArrayList<>();
		
		vegitable.add("PATATO");
		vegitable.add("TAMATO");
		vegitable.add("PEA");
		vegitable.add("CARROT");
		vegitable.add("RADISH");
		
		List<String> groceryList = new ArrayList<>();
		groceryList.addAll(fruits);
		groceryList.addAll(vegitable);
		Collections.sort(groceryList);
		
		System.out.println("YOUR GROCERRY LIST =" +groceryList);
	}

}
