package com.kodewala;
import java.util.*;
public class CostomArrayListSortWithComparator {

	public static void main(String[] args) {
		List<Table> table = new ArrayList<>();
		
		table.add(new Table("BOOK", 34));
		table.add(new Table("NOTBOOK", 134));
		table.add(new Table("BOOKOFTHESTORY", 3));
		table.add(new Table("PEN", 3445));
		table.add(new Table("RAMAYAN", 3354));
		table.add(new Table("MAHABHARAT", 4654));
		table.add(new Table("GITA", 354));
		table.add(new Table("RAMCHARITMANAS", 56734));
		
		Collections.sort(table, (p1,p2) -> p1.name.compareTo(p2.name));
		
		Collections.sort(table, new Comparator<Table>() {
			public int compare(Table p1, Table p2) {
				return p1.name.compareTo(p2.name);
			}
			
		});
		
		
			
		
		
		System.out.println("Sorted by Product Name:");
		for(Table P : table) {
			System.out.println(P);
		}
	}

}
