package com.kodewala;
import java.util.*;
public class Challange3ArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		System.out.println("Enter 5 Favorite Movie Name");
		for(int i=0; i<5; i++) {
			list.add(sc.nextLine());
		}
		
		for(String name : list) {
			
			System.out.println(name);
			
		}
		
		
		System.out.println("THIS IS THE FIRST MOVIE =" +list.get(0));
		System.out.println("THIS IS THE LAST MOVIE=" +list.get(list.size() - 1));
		
		
	}

}
