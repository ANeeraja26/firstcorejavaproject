package com.arrays;

public class SearchElementArrayTask {

	public static void main(String[] args) {
		System.out.println("main method started");
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println("enter a element");
        int key = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }

	

}
