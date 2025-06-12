package com.kodewala;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueBookTitle {

	public static void main(String[] args) {
	String nameOfBook[]=	{"Harry Potter", "Narnia", "Harry Potter", "Ramayan", "Narnia"};
	
	Set<String> listOfUnicBook = new LinkedHashSet<String>();
	for(String list : nameOfBook) {
		listOfUnicBook.add(list);
	}
	
	System.out.println(listOfUnicBook);

	}

}
