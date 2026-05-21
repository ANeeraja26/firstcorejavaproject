package com.task;

import java.util.Scanner;

public class EMI {
	
	
	// Method to calculate EMI
    double calculateEMI(double loanAmount, int months) {
        return loanAmount / months;
    }
    
    //method to calculate Interest
    double calculateInterest(double loanAmount, double interestRate ) {
    	return (loanAmount*interestRate)/100;
    }
    
    // Method to calculate GST
     double CalculateTotalAmount(double loanAmount, double interest) {
         return loanAmount + interest;

     }
     
     // Method to calculate GST
     double calculateGST(double amount, double gstPercentage) {
         return (amount * gstPercentage) / 100;
     }


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		EMI e=new EMI();
		
		
		System.out.println("enter loan amount");
		double loanAmount =sc.nextDouble();
		
		System.out.println("enter no of months");
		int months=sc.nextInt();
		
		System.out.println("enter interest rate");
		double InterestRate =sc.nextDouble();
		
        System.out.print("Enter GST Percentage: ");
        double gstPercentage = sc.nextDouble();
        
        
        // Method calls
        double emi = e.calculateEMI(loanAmount, months);

        double interest = e.calculateInterest(loanAmount, InterestRate);

        double totalAmount = e.CalculateTotalAmount(loanAmount, interest);

        double gst = e.calculateGST(totalAmount, gstPercentage);
        
        System.out.println("main method started");
        
        
        
        System.out.println("------------EMI Detalis---------------");
        System.out.println("EMI="+emi);
        System.out.println("INTEREST="+interest);
        System.out.println("TOTAL AMOUNT="+ totalAmount);
        System.out.println("GST="+gst);
        
        
        
        System.out.println("main method ended");
        
        
        
        
        sc.close();

      }
}
