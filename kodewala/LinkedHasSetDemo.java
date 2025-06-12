package com.kodewala;
import java.util.*;

public class LinkedHasSetDemo {

	public static void main(String[] args) {
		Set<String> list = new  LinkedHashSet<>();
		list.add("PRASHANT");
		list.add("Nishant");
		list.add("Raushan");
		list.add("Prakash");
		list.add("Pream");
		list.add("Prearna");
		list.add("PRASHANT");
		list.add(null);
		
		
		System.out.println(list);
		
		//for(String s1 : list) {
		//	System.out.println(s1);
		//}
		
		Iterator<String> name = list.iterator();
	    while(name.hasNext()) {
	    	String s1 = name.next();
	    	System.out.println(s1);
	    	
	    }
			
			
			
		
		};
		
		

	}


