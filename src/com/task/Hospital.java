package com.task;

public class Hospital {
	
   static String hospitalName="Apollo";
    
    int patientId=101;
    
    String patientName;
    double treatmentCost;
    int tax=5;
    double totalBill;
    
    void calTax() {
    	double taxAmount=((tax/100.0)*treatmentCost);
    	totalBill=treatmentCost+taxAmount;
    }
    
    
     public static void main(String[] args) {
    	 System.out.println("main method started");

    	 
         Hospital h1= new Hospital ();
         h1.patientName="Neeraja";
         h1.treatmentCost=50000;
         h1.calTax();
         

         System.out.println("Hospital Name:"+hospitalName);

         System.out.println("patientId:"+h1.patientId);
         System.out.println("patientName:"+h1.patientName);
         System.out.println("treatmentCost:"+h1.treatmentCost);
         System.out.println("totalBill:"+h1.totalBill);
         
         
         }
    	 
    	}


