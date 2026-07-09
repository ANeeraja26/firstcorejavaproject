package com.task;

import java.util.Scanner;


public class CaseStudy3 {

	public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of products: ");
	        int n = sc.nextInt();

	        int[] prices = new int[n];

	        int total = 0;
	        int max = 0;
	        int min = 0;
	        int count = 0;

	        System.out.println("Enter product prices:");

	        for (int i = 0; i < n; i++) {
	            prices[i] = sc.nextInt();

	            total += prices[i];

	            if (i == 0) {
	                max = prices[i];
	                min = prices[i];
	            }

	            if (prices[i] > max)
	                max = prices[i];

	            if (prices[i] < min)
	                min = prices[i];

	            if (prices[i] > 1000)
	                count++;
	        }

	        System.out.println("Total Bill = " + total);
	        System.out.println("Highest Price = " + max);
	        System.out.println("Lowest Price = " + min);
	        System.out.println("Products above 1000 = " + count);

	        System.out.print("Enter product price to search: ");
	        int search = sc.nextInt();

	        int flag = 0;

	        for (int i = 0; i < n; i++) {
	            if (prices[i] == search) {
	                flag = 1;
	                break;
	            }
	        }

	        if (flag == 1)
	            System.out.println("Product Found");
	        else
	            System.out.println("Product Not Found");

	        sc.close();
	    }
	}




