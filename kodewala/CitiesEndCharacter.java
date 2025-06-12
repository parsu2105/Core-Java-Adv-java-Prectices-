package com.kodewala;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CitiesEndCharacter {

	public static void main(String[] args) {
		
		String[] nameOfCity = {"Delhi", "Amsterdam", "Agra", "Alaska", "Oslo", "Assam"};
		
		List<String> listOfCity = new ArrayList<String>(Arrays.asList(nameOfCity));
		
		Iterator<String> listItrat = listOfCity.iterator();
		
		while(listItrat.hasNext()) {
			
			String name = listItrat.next().toLowerCase();
			
			char firtChar = name.charAt(0);
			
			char lastChar = name.charAt(name.length()-1);
			
			if(firtChar == lastChar) {
				System.out.println(name);
			}
			
			
		}
	}

}
