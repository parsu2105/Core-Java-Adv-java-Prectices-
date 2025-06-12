package com.kodewala;
import java.util.*;
public class HasMapExample {

	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<>();
			phoneBook.put("PRASHANT", "6206841141");
			phoneBook.put("NISHANT", "9113100136");
			
			System.out.println(phoneBook.get("NISHANT"));
			System.out.println(phoneBook.get("PRASHANT"));
			System.out.println(phoneBook);
	}

}
