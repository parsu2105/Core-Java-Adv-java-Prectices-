package mybasicpractice;

public class ThirdProram {

	public static void main(String[] args) {
		
		int[] arr = {10, 22, 5, 78, 3};
		int max = arr[0];
		for(int i=1 ; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		System.out.println(max);

	}

}
