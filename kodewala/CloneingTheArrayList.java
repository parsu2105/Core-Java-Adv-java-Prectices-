package com.kodewala;
import java.util.*;
public class CloneingTheArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> listOfDish = new ArrayList<>();
		System.out.println("ENTER YOUR 5 DISH");
		for(int i=0; i<5; i++) {
			listOfDish.add(sc.nextLine());
		}
		
		System.out.println("YOUR ORIGINAL DISH LIST = " +listOfDish);
		
		List<String> list1 = new ArrayList<>(listOfDish);
		System.out.println("ENTER YOUR another DISH");
		for(int i=0; i<2; i++) {
			list1.add(sc.nextLine());
		}
		System.out.println("YOUR CLONE DISH = " +list1);
	}

}
