package com.kodewala;

import java.util.*;

public class UpdateElement {

	public static void main(String[] args) {
		List<String> color = new ArrayList<>();
		color.add("Red");
		color.add("GREEN");
		color.add("PINK");
		
		System.out.println("THIS IS BEFORE UPDATE:"+ color);
		color.set(0,"Black");
		color.set(1, "BLUE");
		color.set(2, "BROWN");
		
		System.out.println("After update: " + color);
	}

}
