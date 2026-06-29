package com.task;

public class FrequencyOfEachElementInAnArray23june {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int []arr= {1,3,4,5,2,5,8,9,2,3,4};
		
		boolean[] a = new boolean[arr.length];
		
		for(int i=0;i<arr.length; i++) {
			if(a[i]) {
				continue;
				
				
			}
			int count=1;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					a[j]=true;
				}
				
			}
			
			System.out.println(arr[i] + " occurs" + count + " times");
			
		}
	}

}
