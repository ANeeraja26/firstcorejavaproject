package com.task;

public class CaseStudy6 {

	public static void main(String[] args) {
		System.out.println("main method started");

		String str = "google amazon google youtube google amazon";

		String[] arr = str.split(" ");

		int max = 0;
		String result = "";

		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}

			if (count > max) {
				max = count;
				result = arr[i];
			}
		}

		System.out.println(result);
	}

}
