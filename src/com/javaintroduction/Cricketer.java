package com.javaintroduction;

public class Cricketer {
	String cricketerName;
	int jerseyNo;
	static String countryName;
	static int countryID;
	public static void main(String[] args) {
		System.out.println("indian Cricket Team info");
        System.out.println("object1 info");
        Cricketer msd=new Cricketer();
        msd.jerseyNo=7;
        msd.cricketerName="Dhoni";
        countryID=91;
        countryName="india";
        System.out.println("country Name:"+countryName);
        System.out.println("country ID:"+countryID);
        System.out.println("Jersey Number:"+msd.jerseyNo);
        System.out.println("Cricketer Name:"+msd.cricketerName);
        
        
        System.out.println("object2 info");
        Cricketer virat=new Cricketer();
        virat.jerseyNo=18;
        virat.cricketerName="virat kohli";
        countryID=91;
        countryName="india";
        System.out.println("country Name:"+countryName);
        System.out.println("country ID:"+countryID);
        System.out.println("Jersey Number:"+virat.jerseyNo);
        System.out.println("Cricketer Name:"+virat.cricketerName);
        
        System.out.println("object3 info");
        Cricketer kl=new Cricketer();
        kl.jerseyNo =1;
        kl.cricketerName= "K L Rahul";
        countryID=92;
        countryName="Bharath";
        System.out.println("country Name:"+countryName);
        System.out.println("country ID:"+countryID);
        System.out.println("Jersey Number:"+kl.jerseyNo);
        System.out.println("Cricketer Name:"+kl.cricketerName);
        
        
        
 
        
 
 
 
        
        
        
        
        
        
		
	

	}

}
