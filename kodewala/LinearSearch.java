package com.kodewala;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {33,44,55,67,88,22,33,45,667,7,88,54};
		int target=45;
		int ans=main(arr,target);
		System.out.println(ans);

	}
	
	static int main(int[] arr, int target)
	{
		if(arr.length==0)
		{
			return -1;
		}
		for(int a:arr)
		{
			
			if(a==target) {
				
				return a;
			}
		}
		return -2;
	}

}
