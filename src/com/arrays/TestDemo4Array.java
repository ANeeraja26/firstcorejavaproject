package com.arrays;

// WAp to find sum and avg of all the marks
public class TestDemo4Array {

	public static void main(String[] args) {

		int[] marks = { 86, 90, 77, 86, 90 };
		System.out.println(marks);// Address of the object [I@2b2fa4f7
		System.out.println(marks.length);

		int sum = 0;
		int avg = 0;

		// for (int i = 0; i < marks.length; i++) {
			// sum = sum + marks[i];

	//	}
	
		
		for(int m:marks) {
			sum+=m;
			
		}
			avg=sum/marks.length;

		
		System.out.println("total marks:" + sum);
		System.out.println("avg of all marks:"+avg);
	}

}
