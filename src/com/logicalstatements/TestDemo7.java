package com.logicalstatements;

import java.util.Scanner;

// WRP to find the student grade based on their marks.
// here we are using yield keyword
public class TestDemo7 {

	static Scanner sc = new Scanner(System.in);

	static String getGradeInfo(int marks) {

		System.out.println("enter how many subjects");
		int subjects = sc.nextInt();

		String grade = switch ((marks/10)/10) {
		case 10,9 -> "garde A";
		case 8-> {
			System.out.println("good results");
			yield "grade B";

		}
		case 7,6 -> {
			System.out.println("average");
			yield "grade C";

		}
		case 5,4 -> {
			System.out.println("just pass");
			yield "grade D";

		}
		default->"garde F";
		};
		
		return grade;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("enter your marks");
		

		int marks = sc.nextInt();

		getGradeInfo(marks);
	}

}
