package com.task;

public class MovieTheaterCaseStudyTask {

	public static void main(String[] args) {

		int availableSeats = 0;
        int totalSeats = 100;


		for (int seat = 1; seat <= 100; seat++) {

			if (seat == 5 || seat == 10 || seat == 20 || seat == 38 || seat == 50 || seat == 67 || seat == 81
					|| seat == 90 ||seat==94 ||seat==98) {

				System.out.println("Seat " + seat + " : Booked");
			} else {
				System.out.println("Seat " + seat + " : Available");
				availableSeats++;
			}
		}

		System.out.println("Total Available Seats: " + availableSeats);
	}
}

