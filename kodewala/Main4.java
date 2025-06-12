package com.kodewala;
class Parent2{
	Parent2(){
		System.out.println("parent construtor called");
	}
}

class Child2 extends Parent2{
	Child2(){
		this(20);
		System.out.println("child default constructor called");
		
	}

	Child2(int x){
		super(); //call parent constructor.
		System.out.println("child parameterize constructor called:"+x);
	}
}
public class Main4 {

	public static void main(String[] args) {
		Child2 s1=new Child2();

	}

}
