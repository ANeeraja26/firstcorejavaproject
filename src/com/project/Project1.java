package com.project;

import java.util.Scanner;

public class Project1 {

	    public static void main(String[] args) {

	        System.out.println("********** Number Guessing Game **********");

	        Scanner sc = new Scanner(System.in);

	        String playAgain = "yes";

	        while (playAgain.equalsIgnoreCase("yes")) {

	            int randomNumber = (int) (Math.random() * 10) + 1;
	            int attempts = 3;
	            boolean guessed = false;

	            System.out.println("Game Started!");
	            System.out.println("You have only 3 attempts.");

	            while (attempts > 0) {

	                System.out.print("Enter a number between 1 and 10: ");
	                int userNumber = sc.nextInt();

	                if (userNumber == randomNumber) {
	                    System.out.println("Good Job! You guessed the correct number.");
	                    guessed = true;
	                    break;
	                } else if (userNumber > randomNumber) {
	                    System.out.println("Too Big!");
	                } else {
	                    System.out.println("Too Small!");
	                }

	                attempts--;
	                System.out.println("Attempts Left: " + attempts);
	            }

	            if (!guessed) {
	                System.out.println("Sorry! You have used only 3 attempts");
	                System.out.println("Correct Number was: " + randomNumber);
	            }

	            System.out.print("Do you want to  play again (yes/no)? ");
	            playAgain = sc.next();
	        }

	        System.out.println("Game Over!");
	        sc.close();
	    }
	}