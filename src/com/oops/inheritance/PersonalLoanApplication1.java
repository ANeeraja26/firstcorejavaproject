package com.oops.inheritance;

import java.util.Scanner;

public class PersonalLoanApplication1 extends LoanImpl {

		void getPersonalLoanDocInfo() {
		System.out.println("All personal loan documents submitted sucessfully:");
	}

	
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to personal loan banking");

		PersonalLoanApplication1 pl = new PersonalLoanApplication1();

		if (pl.isPhoneValid() && pl.isAadharValid() && pl.isPanValid()) {
			double income = pl.getCustomerSalary();
			int cibil = pl.getCibilScore();
			int age = pl.ageInfo();

			if ((age > 22 && age <= 60) && income >= 50000.00 && cibil > 300 && cibil <= 900) {
				System.out.println("congrtas you are eligible for personal loan");

				double roi = pl.getROI();

				if (cibil >= 300 && cibil <= 600) {
					System.out.println("poor score");
					roi = roi + 3.5;

				} else if (cibil > 600 && cibil < 700) {
					System.out.println("fair score");
					roi = roi + 2.5;

				} else if (cibil > 700 && cibil < 750) {
					System.out.println("good score");
					roi = roi + 1.5;

				} else {
					roi = roi - 1.0;
				}

				System.out.println("your rate of interset is:"+roi);
				
				System.out.println("as you entered address details are :"+pl.getAddressDetails());

			} else {
				System.out.println("sorry focus on carrer frist:");
			}

		} else {
			System.out.println("something went wrong with personal details check and re- enter");
		}

	}

}
