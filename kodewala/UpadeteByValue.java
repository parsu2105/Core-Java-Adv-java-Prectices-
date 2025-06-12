package com.kodewala;
import java.util.*;
public class UpadeteByValue {

	public static void main(String[] args) {
		List<String> language = new ArrayList<>();
		language.add("JAVA");
		language.add("C++");
		language.add("PHYTHON");
		
		
		System.out.println("BEFORE UPDATE: "+ language);
		
		String oldValue = "C++";
		String newValue = "C";
		
		int index = language.indexOf(oldValue);
		if(index != -1) {
			language.set(index, newValue);
			System.out.println("AFTER UPDATE: " + language);
		}else {
			System.out.println(oldValue +"not found");
		}

	}

}
