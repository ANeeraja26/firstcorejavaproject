package com.task;

import java.util.Scanner;

public class TestDemo6 {
	
	 static void Name(String name) {
		System.out.println("Student name:"+name);
	}
	 static void Age(int Age) {
			System.out.println("Student Age:"+Age);
		}
	 static void height (float height) {
			System.out.println("Student height:"+height);
		}
	 static void weight(Double weight) {
			System.out.println("Student weight:"+weight);
		}
	 static void Id(int Id) {
			System.out.println("Student Id:"+Id);
		}
	 static void phone(long phone) {
			System.out.println("Student phone:"+phone);
		}
	 static void branch(String branch) {
			System.out.println("Student branch:"+branch);
		}
	 static void city(String city) {
			System.out.println("Student city:"+city);
		}
	 static void course(String course) {
			System.out.println("Student course:"+course);
		}
	 static void CGPA(Float CGPA) {
			System.out.println("Student CGPA:"+CGPA);
		}
	 static void section(char section) {
			System.out.println("Student section:"+section);
		}
	 static void fee(double fee) {
			System.out.println("Student fee:"+fee);
		}
	 static void result(String result) {
			System.out.println("Student result:"+result);
		}
	 static void nationality(String nationality) {
			System.out.println("Student nationality:"+nationality);
		}
	 static void Skills(String Skills) {
			System.out.println("Student Skills:"+Skills);
		}
	 static void hobbies(String hobbies) {
			System.out.println("Student hobbies:"+hobbies);
		}
	 static void Tranning(String Tranning) {
			System.out.println("Student Tranning:"+Tranning);
		}
	 static void Bloodgroup(String Bloodgroup) {
			System.out.println("Student Bloodgroup:"+Bloodgroup);
		}
	 static void Mothername(String Mothername) {
			System.out.println("Student Mothername:"+Mothername);
		}
	 static void Fathername(String Fathername) {
			System.out.println("Student Fathername:"+Fathername);
		}
	 static void project(String project) {
			System.out.println("Student project:"+project);
		}
	 static void Carriergoal(String Carriergoal) {
			System.out.println("Student Carriergoal:"+Carriergoal);
		}
	 static void Gender(String Gender) {
			System.out.println("Student Gender:"+Gender);
		}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a student name;");
		String sname=sc.nextLine();
		Name(sname);
		
		System.out.println("enter a student Age;");
		int sAge=sc.nextInt();
		Age(sAge);
		
		System.out.println("enter a student height;");
		float  sheight=sc.nextFloat();
		height(sheight);
		
		System.out.println("enter a student weight;");
		double sweight=sc.nextDouble();
		weight(sweight);
		
		System.out.println("enter a student Id;");
		int sId=sc.nextInt();
		Id(sId);
		
		System.out.println("enter a student phone;");
		long sphone=sc.nextLong();
		phone(sphone);
		
		System.out.println("enter a student branch;");
		sc.nextLine();
		String sbranch=sc.nextLine();
		branch(sbranch);
		
		System.out.println("enter a student city;");
		sc.nextLine();
		String scity=sc.nextLine();
		city(scity);
		
		System.out.println("enter a student course;");
		sc.nextLine();
		String scourse=sc.nextLine();
		course(scourse);
		
		System.out.println("enter a student CGPA;");
		float sCGPA=sc.nextFloat();
		CGPA(sCGPA);
		
		System.out.println("enter a student section;");
		char ssection=sc.next().charAt(0);
		section(ssection);
		
		System.out.println("enter a student fee;");
		double sfee=sc.nextDouble();
		fee(sfee);
		
		System.out.println("enter a student result;");
		sc.nextLine();
		String sresult=sc.nextLine();
		result(sresult);
		
		System.out.println("enter a student nationality;");
		sc.nextLine();
		String snationality=sc.nextLine();
		nationality(snationality);
		
		System.out.println("enter a student Skills;");
		sc.nextLine();
		String sSkills=sc.nextLine();
		Skills(sSkills);
		
		System.out.println("enter a student hobbies;");
		sc.nextLine();
		String shobbies=sc.nextLine();
		hobbies(shobbies);
		
		System.out.println("enter a student Tranning;");
		sc.nextLine();
		String sTranning=sc.nextLine();
		Tranning(sTranning);
		
		System.out.println("enter a student Bloodgroup;");
		sc.nextLine();
		String sBloodgroup=sc.nextLine();
		Bloodgroup(sBloodgroup);
		
		System.out.println("enter a student Mothername;");
		sc.nextLine();
		String sMothername=sc.nextLine();
		Mothername(sMothername);
		
		System.out.println("enter a student Fathername;");
		sc.nextLine();
		String sFathername=sc.nextLine();
		Fathername(sFathername);
		
		
		System.out.println("enter a student project;");
		sc.nextLine();
		String sproject=sc.nextLine();
		project(sproject);
		
		System.out.println("enter a student Carriergoal;");
		sc.nextLine();
		String sCarriergoal=sc.nextLine();
		Carriergoal(sCarriergoal);
		
		System.out.println("enter a student Gender;");
		sc.nextLine();
		String sGender=sc.nextLine();
		Gender(sGender);
		
		


	}

}
