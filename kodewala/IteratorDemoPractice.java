package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemoPractice {

	public static void main(String[] args) {
		
		
		String[] frutName = {"Apple", null, "Banana", null, "Cherry"}; 
		List<String> list = new ArrayList<String>(Arrays.asList(frutName));
		Iterator<String> withouNull = list.iterator();
		while(withouNull.hasNext()) {
			String ignoreNull = withouNull.next();
			if(ignoreNull==null) {
				withouNull.remove();
			}else {
				System.out.println(ignoreNull);
			}
		}
		
		
		



        String[] alphaBet = {"A", "B", "C", "D"}; 
        List<String> list1 = new ArrayList<>(Arrays.asList(alphaBet));
        
        ListIterator<String> withouNull1 = list1.listIterator(list1.size());
        
        while (withouNull1.hasPrevious()) {
            String ignoreNull1 = withouNull1.previous();
            System.out.println(ignoreNull1);
        }
    }
}
	
	


