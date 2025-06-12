package com.Prectice;

public class StringReverse {

	public static void main(String[] args) {
		String s1="PRASHANT";
		String rev=" ";
		char[] s2=s1.toCharArray();
		for(int i=s2.length-1;i>=0;i--) {
			rev+=s2[i];
		}
		System.out.println(rev);

	}

}
