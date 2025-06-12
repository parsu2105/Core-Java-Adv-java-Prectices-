package com.kodewala;
import java.util.*;
public class FavrateMovieArrayListPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("ENTER THE 5 Fav Movie");
		for(int i=0; i<5; i++) {
			list.add(sc.nextLine());
		}
		
	    System.out.println("ENTER YOUR MOVIE NAME");
	    String name = sc.nextLine();
	    
	    if(list.contains(name)) {
	    	list.remove(name);
	    	System.out.println(name+" "+"removed successfully");
	    }else {
	    	System.out.println("MOVIE NOT FOUND");
	    }
	    
	    System.out.println("THIS IS YOUR UPDATED MOVIE NAME");
	    for(String userMoveName : list) {
	    	System.out.println(userMoveName);
	    }

	}

}
