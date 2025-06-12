package com.Revijan;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaExpression {

	public static void main(String[] args) {
		
		//Lambda expression two add two integers
		BiFunction<Integer, Integer, Integer> sum = (a,b)->a+b;
		int result = sum.apply(4, 654);
		System.out.println("SUM IS : " +result);
		
		
		BiFunction<Integer, Integer, Integer> sum1 = (a,b)->a+b;
		int result1 = sum1.apply(45, 43);
		System.out.println("SUM IS : " +result1);
		
		
		BiFunction<Integer, Integer, Integer> sum2 = (a,b)->a+b;
		int result2 = sum2.apply(44, 64);
		System.out.println(result2);
		
		BiFunction<Integer, Integer, Integer> sumOf = (a,b)->a+b;
		System.out.println(sumOf.apply(43, 46));
		
	BiFunction<Integer, Integer, Integer>	sumOfNum = (a,b)->a+b;
	System.out.println(sumOfNum.apply(456, 235));
	
	BiFunction<String, String, String> s = (a,b)->a+b;
	String fullname = s.apply("PRASHANT", "KUMAR");
	System.out.println("FULLNAME =" +fullname);
	
	Function<Integer, Integer> s1 = a-> a*a;
	System.out.println(s1.apply(3));
	
	Predicate<Integer> s6 = a->a%2==0;
	System.out.println(s6.test(43));
	System.out.println(s6.test(34));
	
	Predicate<Integer> s2 = a->a%2!=0;
	System.out.println(s2.test(434));
	
	Function<String, Integer> s8 = a->a.length();
	System.out.println(s8.apply("PRASHANTKUMAR"));
	
	Function<String, Integer> s9 = a->a.length();
	System.out.println(s9.apply("VISHAKHAKUMARI"));
		
	Consumer<String> s4 = a->System.out.println(a.toUpperCase());
	s4.accept("PRASHANTkumar");
	
	Consumer<String> s0 = a->System.out.println("HELLO,"+a);
	s0.accept("AMIT");
		
	Predicate<String> check = a->a.length()>5;
	System.out.println(check.test("PRASHANT"));
		
	BiConsumer<Integer, Integer> div = (a,b)-> {
	if(b==0) {
		System.out.println("Can't divide by Zero");
	}else {
		System.out.println("Result: " +(a/b));
	}
	};
	
	div.accept(39,45);
	div.accept(8, 0);
	
		Function<String, String> revrse = a->new StringBuffer(a).reverse().toString();
		System.out.println(revrse.apply("PRASHANT"));
		

	}

}
