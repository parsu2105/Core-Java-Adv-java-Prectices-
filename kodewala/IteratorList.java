package com.kodewala;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorList {

	public static void main(String[] args) {
		List<String> fruit = new ArrayList<>() ;
		fruit.add("Apple");
		fruit.add("pinaple");
		fruit.add("Cherry");
		fruit.add("Leamon");
		fruit.add("Chicku");
		
		Iterator<String> list = fruit.iterator();
		while(list.hasNext()) {
			String nm = list.next();
			System.out.println(nm);
		}
		
		
		List<Integer> evennum = new ArrayList<>();
		evennum.add(2);
		evennum.add(3);
		evennum.add(5);
		evennum.add(48);
		evennum.add(44);
		
		Iterator<Integer> s1 = evennum.iterator();
		while(s1.hasNext()) {
			int num = s1.next();
			if(num%2==0) {
				s1.remove();
			}else {
				System.out.println(num);
			}
		}
		
		String[] naam = {"John", "Johnny", "Alice", "Bob", "Johnathan", "Anjali", "Joey"};

		List<String> name = new ArrayList<>(Arrays.asList(naam));
		
		Iterator<String> check = name.iterator();
		while(check.hasNext()) {
			String nm = check.next().toUpperCase();
			if(nm.startsWith("JOH")) {
				check.remove();
			}else {
				System.out.println(nm);
			}
		}
		
		
		String[] nameOfPerson = {"Ricky", "Pooja", "Bobby", "Aman", "Sandy", "Neha"};
		List<String> test = new ArrayList<>(Arrays.asList(nameOfPerson));
		
		Iterator<String> chk = test.iterator();
		while(chk.hasNext()) {
			String prson = chk.next().toUpperCase();
			if(prson.endsWith("Y")) {
				chk.remove();
			}else {
				System.out.println(prson);
			}
			
		}
		
		Integer[] num = {34, 89, 12, 67, 45, 99};
		int count=0;
		List<Integer> numeric = new ArrayList<>(Arrays.asList(num));
		Iterator<Integer> ch = numeric.iterator();
		while(ch.hasNext()) {
			int a = ch.next();
			if(a>50) {
				count++;
				System.out.println(a);
			}
		}
		System.out.println(" count number is greater then 50 is "  +count);

	
		

	}

}
