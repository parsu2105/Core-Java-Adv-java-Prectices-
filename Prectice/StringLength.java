package com.Prectice;

public class StringLength {

	
	public static void main(String[] args) {
		int[] arr = new int[]{5,7,9,17,27};
	boolean result = FindArrayElement(arr , 9); 
	System.out.println(result);
	}
	
	public static boolean FindArrayElement(int[] arr, int find) {
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(find==arr[i])
			{
				return true;
			}
			
		}
		return false;
	}

}


