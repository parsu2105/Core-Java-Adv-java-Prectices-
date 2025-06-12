package com.kodewala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class ComparablePractice implements Comparable<ComparablePractice>{

	int id;
	String name;
	
	public ComparablePractice(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(ComparablePractice other) {
		return this.id - other.id;
	}
	
	public String toString() {
		return id + " - " + name;
	}
	
	public static void main(String[] args) {
		
		
		List<ComparablePractice> list = new ArrayList<>();
		    list.add(new ComparablePractice(3, "Ravi"));
	        list.add(new ComparablePractice(1, "Aman"));
	        list.add(new ComparablePractice(2, "Neha"));
	        	
	        
	        Collections.sort(list);

	        for (ComparablePractice s : list) {
	            System.out.println(s);
	}

}
