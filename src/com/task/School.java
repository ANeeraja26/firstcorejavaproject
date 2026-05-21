package com.task;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        System.out.print("Enter Mathematics Marks: ");
        int Mathematics = sc.nextInt();

        System.out.print("Enter Science Marks: ");
        int science = sc.nextInt();

        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();
        

        System.out.print("Enter Social Marks: ");
        int social = sc.nextInt();

        System.out.print("Enter Telugu Marks: ");
        int telugu = sc.nextInt();

        // Calculate total
        int total = Mathematics + science + english + social + telugu;

        // Calculate percentage
        double percentage = total / 5.0;

        // Display output
        System.out.println("----- ABC HIGH SCHOOL RESULT -----");
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage  = " + percentage + "%");

        sc.close();
    }


	}


