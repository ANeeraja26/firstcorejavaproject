package com.task;

import java.util.Scanner;

public class Naukri {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("---------------- Naukari App job Portal-------------------");
		System.out.println("Enter a Candidate Name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter Percentage");
		double percentage = sc.nextDouble();
		System.out.println("Enter Experience (year)");
		int Experience =sc.nextInt();
		sc.nextLine();	
		
		System.out.println("Enter Qualification (BSC/BCOM/BTECH/MBA/MCA");
		String Qualification=sc.nextLine();
        System.out.print("Enter Skill (Java/Python/Testing/HTML/Marketing): ");
        String skill = sc.nextLine();

        System.out.println("-------------JOB ELIGIBILITY REPORT--------");
        
        if(age<18) {
        	System.out.println("Not Eligible: Candidate must be at least 18 years old.");
        }else if (Qualification.equalsIgnoreCase("BTech")
                && skill.equalsIgnoreCase("Java")
                && percentage >= 70
                && Experience >= 2) {

            System.out.println("Eligible for Java Developer");
            System.out.println("Expected Salary: 6 - 10 LPA");
        }
        else if (Qualification.equalsIgnoreCase("BTech")
                && skill.equalsIgnoreCase("Python")
                && percentage >= 70
                && Experience >= 2) {

            System.out.println("Eligible for Python Developer");
            System.out.println("Expected Salary: 6 - 12 LPA");
        }
        else if (Qualification.equalsIgnoreCase("MCA")
                && skill.equalsIgnoreCase("Java")
                && percentage >= 65) {

            System.out.println("Eligible for Software Engineer");
            System.out.println("Expected Salary: 5 - 8 LPA");
        }
        else if (Qualification.equalsIgnoreCase("BSc")
                && skill.equalsIgnoreCase("Testing")
                && percentage >= 60) {

            System.out.println("Eligible for Software Tester");
            System.out.println("Expected Salary: 3 - 5 LPA");
        }
        else if (Qualification.equalsIgnoreCase("BSc")
                && skill.equalsIgnoreCase("HTML")) {

            System.out.println("Eligible for Web Designer");
            System.out.println("Expected Salary: 3 - 6 LPA");
        }
        else if (Qualification.equalsIgnoreCase("MBA")
                && skill.equalsIgnoreCase("Marketing")) {

            System.out.println("Eligible for Marketing Executive");
            System.out.println("Expected Salary: 4 - 7 LPA");
        }
        else if (Qualification.equalsIgnoreCase("BCom")
                && percentage >= 60) {

            System.out.println("Eligible for Accountant");
            System.out.println("Expected Salary: 3 - 5 LPA");
        }
        else if (Experience >= 5 && percentage >= 60) {

            System.out.println("Eligible for Senior Level Positions");
            System.out.println("Expected Salary: 8 - 15 LPA");
        }
        else if (Experience == 0 && percentage >= 75) {

            System.out.println("Eligible for Internship Programs");
            System.out.println("Expected Stipend: 10,000 - 20,000");
        }
        else {
            System.out.println("Currently No Matching Jobs Found.");
            System.out.println("Please Improve Skills and Update Resume.");
        }

        System.out.println("---------------- PROFILE SUMMARY--------------");
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Qualification : " + Qualification);
        System.out.println("Percentage    : " + percentage);
        System.out.println("Experience    : " + Experience + " Years");
        System.out.println("Skill         : " + skill);

        sc.close();


	}

}
