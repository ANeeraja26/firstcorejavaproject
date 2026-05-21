package com.task;

import java.util.Scanner;
	

public class Calculate {
	
     static void calculate (String name, int s1, int s2, int s3) {
    	
    	int total=s1+s2+s3;
    	double average=total/3;
    	System.out.println("-------------student detalis---------------");
    	System.out.println("student name:"+ name);
    	System.out.println("student marks:"+s1);
    	System.out.println("student marks:"+s2);
    	System.out.println("student marks:"+s3);
    	System.out.println("toatl marks:"+total);
    	System.out.println("average marks:"+average);
    	
    }

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a student name");
		String name=sc.nextLine();
		
		System.out.println("enter a subject 1 marks");
		int s1=sc.nextInt();
		
		System.out.println("enter a subject 2 marks");
		int s2=sc.nextInt();
		
		System.out.println("enter a subject 3 marks");
		int s3=sc.nextInt();
		
		calculate("name",s1,s2,s3);
		
		}

}
