package com.KodeWalaClassTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasic {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,4,5,76,34,53,23,44,55,65);
		List<Integer> evenList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<String> name = Arrays.asList("Prashant","Vishakha","Amit","Aniket");
		 name.stream().filter(n -> n.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

	} 

}
