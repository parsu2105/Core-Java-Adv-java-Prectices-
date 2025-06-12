package com.kodewala;

public class LargestNumber {

	public static void main(String[] args) {
		
		LargestNumber.largest(new int[] {55,6,4,33,44,56,74,34,56});
		

	}
	
	public static void largest(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			
		}	
			System.out.println(max);
	}

}
