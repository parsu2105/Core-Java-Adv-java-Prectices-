package com.kodewala;
import java.util.*;
class CloneModifyListArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("ENTER YOUR FIRST DISH");
		for(int i=0; i<5; i++) {
			list.add(sc.nextLine());
		}
		
		System.out.println("YOUR ORIGINAL LIST="+list);
		
	   
		List<String> list1 = new ArrayList<>(list);
		list1.add("PIZZA");
		list1.add("SAMOSA");
		
		System.out.println("CLONED & MODIFIED LIST = " + list1);
	}

}
