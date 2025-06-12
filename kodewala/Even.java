package com.kodewala;

public class Even {

    public static void main(String[] args) {
        int[] arr1 = {23, 44, 66, 55, 10};
        int ans = countEven(arr1);
        System.out.println("Number of even numbers: " + ans);
    }

    static int countEven(int[] arr) {
        int count = 0;
        for (int index=0;index<=arr.length;index++) {  // Using enhanced for-loop for simplicity
            if (String.valueOf(arr).length() % 2 == 0 ) {
                count++;
            }
        }
        return count;
    }
}
