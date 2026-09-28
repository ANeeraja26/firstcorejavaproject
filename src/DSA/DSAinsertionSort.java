package DSA;

//      5 1 6 2 3 4 
// ---> 1 5 6 2 3 4
// ---> 1 5 6 2 3 4
// ---> 1 2 5 6 3 4
// ---> 1 2 3 5 6 4
// ---> 1 2 3 4 5 6

import java.util.Arrays;

public class DSAinsertionSort {
	public static void main(String[] args) {
		System.out.println("main method started");

		        int[] arr = {5, 1, 6, 2, 4, 3};

		        for (int i = 1; i < arr.length; i++) {
		            int temp = arr[i];
		            int j = i;

		            while (j > 0 && arr[j - 1] > temp) {
		                arr[j] = arr[j - 1];
		                j = j - 1;
		            }

		            arr[j] = temp;
		        }

		        System.out.println("After sorting: " + Arrays.toString(arr));
		    }
		
	

}



