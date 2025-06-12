package com.Revijan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,5,6,7,3,5,64,34,45);
		list.stream().filter(x->x%2==0).map(n->n*n).forEach(System.out::println);
		
		System.out.println("---------------------");
		list.stream().filter(x->x>10).forEach(System.out::println);
		System.out.println("----------------------");
		list.stream().map(x->x*2).forEach(System.out::println);
		System.out.println("---------------------------");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("---------------------------");
	List<Integer> s1 = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(s1);
		
		System.out.println("----------------------------");
		list.stream().forEach(x->System.out.println(x));
		System.out.println("-----------------------------------");
		long count = list.stream().count();
		System.out.println(count);
		
		
		
	}

}
