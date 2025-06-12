package com.kodewala;

import java.util.Arrays;

public class ArrayRuningSum {
		
	public static void main(String[] args) {
		
		ArrayRuningSum s1 = new ArrayRuningSum();
		s1.runningSum(new int[]{5,8,9,5,6,8,9});	
		s1.sum(new int[]{-5,-11,119,2,14,17} );
		s1.arrSum(new int[]{4,5},4 );
		
		
	}

	public void runningSum(int arr[]) {
		int sum[]= new int[arr.length];
		sum[0]=arr[0];
		for(int i=1; i<arr.length; i++) {
			sum[i]=arr[i-1]+arr[i];
			
		}
		System.out.println(Arrays.toString(sum));
	}
	
	public void sum(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			arr[i] = arr[i] + arr[i-1];
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public int arrSum(int arr[], int a) {
		a= a+1;
		System.out.println(a);
		arr[1] =-111;
		System.out.println(arr[1]);
		return a;
	}
}
