package com.kodewala;


class Parent{	
  void m1(){
		System.out.println("this is the parent.....1.....class");
	 }
}
  class Child extends Parent {	  
	    void m1(){
		super.m1();
		System.out.println("this is the child......2......class");
	}
  }
public class Override {	
	
	public static void main(String[] args){
		Parent s1=new Parent();
		s1.m1();		
		Parent s2=new Child();
		s2.m1();
	}
}
