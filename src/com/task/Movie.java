package com.task;

public class Movie {

	    int movieId;
	    String movieName;
	    String heroName;
	    double rating;

	    // No Argument Constructor
	    Movie() {
	        this(100);
	        System.out.println("No Argument Constructor");
	    }

	    // One Argument Constructor
	    Movie(int movieId) {
	        this(movieId, "Unknown Movie");
	        System.out.println("One Argument Constructor");
	    }

	    // Two Argument Constructor
	    Movie(int movieId, String movieName) {
	        this(movieId, movieName, "Unknown Hero");
	        System.out.println("Two Argument Constructor");
	    }

	    // Three Argument Constructor
	    Movie(int movieId, String movieName, String heroName) {
	        this(movieId, movieName, heroName, 0.0);
	        System.out.println("Three Argument Constructor");
	    }

	    // Four Argument Constructor
	    Movie(int movieId, String movieName, String heroName, double rating) {
	        this.movieId = movieId;
	        this.movieName = movieName;
	        this.heroName = heroName;
	        this.rating = rating;

	        System.out.println("Four Argument Constructor");
	    }

	    // Display Method
	    void display() {
	        System.out.println("Movie ID   : " + movieId);
	        System.out.println("Movie Name : " + movieName);
	        System.out.println("Hero Name  : " + heroName);
	        System.out.println("Rating     : " + rating);
	        System.out.println("---------------------------");
	    }

	    // Main Method
	    public static void main(String[] args) {

	        // Object 1
	        Movie m1 = new Movie();

	        // Object 2
	        Movie m2 = new Movie(101, "Bahubhali");

	        // Object 3
	        Movie m3 = new Movie(102, "Kalki", "Prabhas", 4.8);

	        // Display Details
	        m1.display();
	        m2.display();
	        m3.display();
	    }
	}



