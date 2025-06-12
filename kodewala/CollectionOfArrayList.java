package com.kodewala;

import java.util.*;

public class CollectionOfArrayList {

	public static void main(String[] args) {
	  List<String> elements = new ArrayList<>();
	  
	  elements.add("PRASHANT");
	  elements.add("NISHANT");
	  elements.add("ISHANT");
	  
	  String search="PRASHANT";
	  
	  if(elements.contains(search)) {
		  System.out.println("FOUND");
	  }else {
		  System.out.println("NOT FOUND");
	  }
	  
	  String newElements = "PRAKESH";
	  String oldElements = "PRASHANT";
	  
	  int index = elements.indexOf(oldElements);
	  
	  System.out.println("YOUR CHANGABLE LIST ");
	  if(index != -1) {
		  elements.set(index, newElements);
		  System.out.println("YOUR NEW LIST IS =" +elements);
	  }
	  
	 System.out.println( "REMOVED ELEMENT =" + elements.remove(0));
	 
	 String[] nameofstudent = new String[elements.size()];
	 nameofstudent = elements.toArray(nameofstudent);
	 System.out.println("YOU SUCESSFULLY CONVERTED INTO ARRAY ");
	 for(String name : nameofstudent) {
		 System.out.println(name);
	 }
	 
	 System.out.println("all the thing is =" + elements);
	}

}
