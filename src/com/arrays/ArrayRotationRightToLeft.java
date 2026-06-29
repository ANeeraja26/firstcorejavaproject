package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

// WAP to print Rotational Order From Right to left
public class ArrayRotationRightToLeft {

	    void reverseArray(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    void rotationalArray(int[] arr, int r) {

	        r = r % arr.length;

	        int start = 0;
	        int end = arr.length - 1;

	        // Step 1: Reverse entire array
	        reverseArray(arr, start, end);

	        // Step 2: Reverse first r elements
	        reverseArray(arr, start, r - 1);

	        // Step 3: Reverse remaining elements
	        reverseArray(arr, r, end);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter rotation count:");
	        int r = sc.nextInt();

	        int[] arr = {1, 2, 3, 4, 5, 6};

	        ArrayRotationRightToLeft obj = new ArrayRotationRightToLeft();
	        obj.rotationalArray(arr, r);

	        System.out.println(Arrays.toString(arr));

	        sc.close();
	    }
	}