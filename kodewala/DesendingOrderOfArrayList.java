package com.kodewala;
import java.util.*;
public class DesendingOrderOfArrayList {
	
    public static void main(String[] args) {
        List<GenralStoreProduct> listOfProduct = new ArrayList<>();

        listOfProduct.add(new GenralStoreProduct("Salt", 345));
        listOfProduct.add(new GenralStoreProduct("Dhaniya", 321));
        listOfProduct.add(new GenralStoreProduct("Mircha", 320));
        listOfProduct.add(new GenralStoreProduct("Haldi", 3455));
        listOfProduct.add(new GenralStoreProduct("Dhaniya", 3445));
        listOfProduct.add(new GenralStoreProduct("Tel", 34556));
        listOfProduct.add(new GenralStoreProduct("Kalajamun", 6345));

        // === Uncomment any one block below to test ===

        // Sort by ID descending
        /*
        Collections.sort(listOfProduct, new Comparator<GenralStoreProduct>() {
            public int compare(GenralStoreProduct p1, GenralStoreProduct p2) {
                return p2.id - p1.id;
            }
        });
        */

        // Sort by length of name
        /*
        Collections.sort(listOfProduct, new Comparator<GenralStoreProduct>() {
            public int compare(GenralStoreProduct p1, GenralStoreProduct p2) {
                return p1.name.length() - p2.name.length();
            }
        });
        */

        // Sort with even IDs first
        Collections.sort(listOfProduct, new Comparator<GenralStoreProduct>() {
            public int compare(GenralStoreProduct p1, GenralStoreProduct p2) {
                boolean isEven1 = p1.id % 2 == 0;
                boolean isEven2 = p2.id % 2 == 0;

                if (isEven1 && !isEven2) return -1;
                else if (!isEven1 && isEven2) return 1;
                else return 0;
            }
        });
        
        Collections.sort(listOfProduct, (p1, p2) -> {
        	boolean even1= p1.id % 2 == 0;
        	boolean even2= p2.id % 2 == 0;
        	
        	if(even1 && !even2) return -1;
        	if(!even1 && even2) return 1;
        	
        	if(p1.id != p2.id) return p2.id - p1.id;
        	
        	return p1.name.length() - p2.name.length();
        });

        System.out.println("✅ Sorted Products:");
        for (GenralStoreProduct s1 : listOfProduct) {
            System.out.println(s1);
        }
    }
}