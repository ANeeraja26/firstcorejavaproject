package com.arrays;

// WAP to print given given number is min or max
public class ArrayFromMinAndMaxNumbers {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 7, 10, 67, 89, 90, 54 };

		int min = arr[0];
		int max = arr[0];

	//	for (int i = 0; i < arr.length; i++) {
			
			//if(arr[i]<min) {
			//	min=arr[i];
				
				
		//	}else if (arr[i]>max)
		//	max=arr[i];

	//	}
		
		for(int a:arr) {
			if(a<min) {
				a=min;
			
		} else if(a>max) {
			max=a;
		}
			
		}

		System.out.println("minimum number form on array is:"+min);
		System.out.println("maximum number form on array is:"+max);

	}

}
