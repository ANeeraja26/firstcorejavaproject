package com.logicalstatements;

// if else program

import java.util.Scanner;

public class TestLpDemo2 {

	public static void main(String[] args) {
   System.out.println("main method started");
   
   Scanner sc=new Scanner(System.in);
   System.out.println("are you attending class regulary");
   boolean areYouAttendingClassregulary=sc.nextBoolean();
   
   System.out.println("are you pratice daliy");
   boolean areYouPraticeDaliy=sc.nextBoolean();
   
   System.out.println("are you attend mock interview");
   boolean areYouAttendingMocks=sc.nextBoolean();
   
   System.out.println("are you attending drives");
   boolean areYouAttendDrives=sc.nextBoolean();
   
   
   
   
   if(areYouAttendingClassregulary && areYouPraticeDaliy && areYouAttendingMocks  ||areYouAttendDrives ) {
	   System.out.println("yes good job");
	   
   }else {
	   System.out.println("you are cheting your parents");
   }
   
   
   
   
   
   
   System.out.println("main method ended");
	}

}
