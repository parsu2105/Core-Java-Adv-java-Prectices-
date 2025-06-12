package com.kodewala;

public class ScopeTest {
  int age ;
  String name;
  String place;
  public void print() {
	  System.out.println(age);
	  System.out.println(name);
	  System.out.println(place);
  }
	
	    public static void main(String[] args) {
	       ScopeTest s1 = new ScopeTest();
	       s1.age=200;
	       s1.name="KYA BHAI KAISA HAI";
	       s1.place="PRASHANT";
	       s1.print();
	    }
	}


