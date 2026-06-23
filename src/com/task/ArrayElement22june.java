package com.task;

public class ArrayElement22june {

	public static void main(String[] args) {
		System.out.println("main method started");
        int arr[] = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element Found at index" + i);

                found = true;
                break;
            }
        }

        if (!found)
    
            System.out.println("Element Not Found");
		
	}

}

