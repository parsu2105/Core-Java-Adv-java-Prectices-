package com.kodewala;

public class StartWith {

	public static void main(String[] args) {
		int count=0;
		String s1[]= {"PRASHANT" , "NISHANT" , "BIHAR" , "ANDHRAPRADESH" , "aKASH" , "AMAN"};
		for(int i = 0 ; i<s1.length ; i++) {
			
			if(s1[i].toLowerCase().startsWith("a")) {
				count++;
				System.out.println(s1[i]);
				
				
			}
			
		}
		System.out.println("TOTAL 'A' CONTAIN WORD IS = " +count);
		
	

	}

}
