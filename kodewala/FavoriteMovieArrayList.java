package com.kodewala;
import java.util.*;
class FavoriteMovieArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		System.out.println("ENTER YOUR 5 MOVIE NAME");
		for(int i=0; i<5; i++) {
			list.add(sc.nextLine());
		}
		
		
		   System.out.println("ENTER THE MOVIE NAME FROM YOUR CHOICE");
		   String userInput = sc.nextLine();
		
			if(list.contains(userInput)) {
				list.remove(userInput);
				System.out.println(userInput +"\"<Movie> removed successfully!\"");
				
			}
			else {
				System.out.println("❌ \"Movie not found!\"");
			}
		     
			System.out.println("\n Updated movie list");
			for(String name : list) {
				System.out.println("THIS IS THE Finally list =" +name);
			}
	}

}
