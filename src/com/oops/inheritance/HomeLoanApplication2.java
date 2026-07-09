package com.oops.inheritance;

public class HomeLoanApplication2 extends LoanImpl {
	void getHomeLoanDocInfo() {
		System.out.println("Home loan documnets have been submitted sucessfully:");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to Home loan banking");

		HomeLoanApplication2 hl = new HomeLoanApplication2();

		if (hl.isPhoneValid() && hl.isAadharValid() && hl.isPanValid()) {
			double income = hl.getCustomerSalary();
			int cibil = hl.getCibilScore();
			int age = hl.ageInfo();

			if ((age > 18 && age <= 75) && income >= 30000.00 && cibil > 300 && cibil <= 900) {
				System.out.println("congrtas you are eligible for personal loan");

				double roi = hl.getROI();

				if (cibil >= 300 && cibil <= 600) {
					System.out.println("poor score");
					roi = roi + 1.5;

				} else if (cibil > 600 && cibil < 700) {
					System.out.println("fair score");
					roi = roi + 1.0;

				} else if (cibil > 700 && cibil < 750) {
					System.out.println("good score");
					roi = roi + 0.5;

				} else {
					roi = roi - 2.0;
				}

				System.out.println("your rate of interset is:"+roi);
				
				System.out.println("as you entered address details are :"+hl.getAddressDetails());

			} else {
				System.out.println("sorry focus on carrer frist:");
			}

		} else {
			System.out.println("something went wrong with personal details check and re- enter");
		}

	}

	}

