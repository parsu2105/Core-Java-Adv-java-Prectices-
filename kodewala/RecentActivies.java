package com.kodewala;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RecentActivies {

	public static void main(String[] args) {
		List<String> actions = new ArrayList<String>(Arrays.asList(
				"Login",
				"Viewed Profile",
				"Sent Messgae",
				"Uploaded Photo",
				"Logged Out"
				));
		
		// Show latest activity first(reverse order)
		System.out.println("Recent Activites(Latest First):");
		ListIterator<String> itr = actions.listIterator(actions.size());
		while(itr.hasPrevious()) {
			System.out.println("-> " +itr.previous());
		}
		
		List<String> massg = new ArrayList<String>(Arrays.asList(
				"Login",
				"Viewed Profile",
				"Uploaded Photo",
				"Logged Out"
				));
		System.out.println("Recent Activites(Latest First)");
		ListIterator<String> list = massg.listIterator(massg.size());
		while(list.hasPrevious()) {
			
			System.out.println("-> " + list.previous());
		}
		
		
		System.out.println("THIS IS THE LIST");
		List<String> cheat = new ArrayList<String>(Arrays.asList(
				"Prashant",
				"Vishakha",
				"Nishant",
				"Ishant",
				"Shruti"
				));
		
		System.out.println("This is the Recent Activity(NAME OF THE LIST)");
		ListIterator<String> s1 = cheat.listIterator(cheat.size());
		while(s1.hasPrevious()) {
			System.out.println("-> " +s1.previous());
			
		}
		
		
		List<String> s11 = new ArrayList<String>(Arrays.asList(
				    "Login",
				    "Viewed Profile",
				    "Sent Message",
				    "Uploaded Photo",
				    "Deleted Message",
				    "Logged Out",
				    "Edited Profile",
				    "Message Read"
				));
		ListIterator<String> list1 = s11.listIterator(s11.size());
		while(list1.hasPrevious()) {
		String str = list1.previous().toUpperCase();
		if(str.contains("MESSAGE")) {
			
			System.out.println(str);
		}
		}
		
		List<String> p1 = new ArrayList<String>(Arrays.asList(
				"Login",
				"Viewed Profile",
				"Upload Photo",
				 "Deleted Message",
				    "Logged Out",
				    "Edited Profile",
				    "Message Read",
				    "Message Vishakha"
				));
		
		ListIterator<String> p2 = p1.listIterator();
		while(p2.hasNext()) {
			String s2 = p2.next();
			if(s2.toLowerCase().contains("message")) {
				p2.set("MESSAGE HIDDEN");
			}
		}
		
		System.out.println("THIS IS THE PHONE MESSAGE");
		p1.forEach(System.out::println);
		
		
		System.out.println("------------------------------------");
		
		List<String> bill = new ArrayList<String>(Arrays.asList(
				"Login",
			    "Deleted Post",
			    "Viewed Profile",
			    "Sent Message",
			    "Deleted Account",
			    "Uploaded Photo"
				));
		
		ListIterator<String> check = bill.listIterator();
		while(check.hasNext()) {
			String mssg = check.next();
			if(mssg.toUpperCase().contains("DELETED")) {
				check.set("Action Removed for Privacy");
			}
		}
		System.out.println("THIS IS THE PHONE MSSG");
		bill.forEach(System.out::println);
		
		
		
		
		
		System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<String> student = new ArrayList<String>(Arrays.asList(
			 "Ritika", "Neha", "Ankita", "Rohan", "Meena", "Aman"
				));
		ListIterator<String> name = student.listIterator(student.size());
		while(name.hasPrevious()) {
		String compare = name.previous();
			if(compare.toUpperCase().endsWith("A")) {
				name.remove();
			}
		}
		System.out.println("-----Updated list------");
		student.forEach(System.out::println);
		
		
		
		
		
		System.out.println("_-----------NEHA HIDDEN && MEENA HIDDEN----------------_");
		List<String> setuse = new ArrayList<String>(Arrays.asList(
			 "Ritika", "Neha", "Ankita", "Rohan", "Meena", "Aman"
				));
		
		ListIterator<String> rmov = setuse.listIterator();
		while(rmov.hasNext()) {
			String nam = rmov.next();
			if(nam.toUpperCase().contains("NEHA") || nam.toUpperCase().contains("MEENA") ) {
				rmov.set("HIDDEN NAME");
			}
		}
		System.out.println("__________SHOW THE MSSG______");
		setuse.forEach(System.out::println);
		
		
		
		System.out.println("_________________________________________");
		List<String> special = new ArrayList<String>(Arrays.asList(
				 "Ritika", "Neha", "Ankita", "Rohan", "Meena", "Aman"
				));
		ListIterator<String> s111 = special.listIterator();
		while(s111.hasNext()) {
			String con = s111.next();
			if(con.toUpperCase().contains("ANKITA")) {
				s111.set("ROHAN");;
			}
		}
		System.out.println("UPDATED NAME ");
		special.forEach(System.out::println);
		
	}
	

}
