package com.language.constructor;

//PEDDI
public class Movie {

	String name;
	String hero;
	String heroine;
	String director;
	double budget;
	String Producer;

	public Movie() {
		this("unknown","unknown");
		
		System.out.println("peddi movie information");
	}

	public Movie(String director, String producer) {
		this.director = director;
		Producer = producer;
	}

	public Movie(Movie m, String hero, String name, String heroine) {
		this.director = m.director;
		this.Producer = m.Producer;
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}


	public Movie(String name, String hero, String heroine, String director, double budget, String producer) {
		this(director,producer);
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
		this.budget = budget;
		
	}

   Movie(Movie a, double budget) {
	   this(a.name, a.hero, a.heroine, a.director, budget, a.Producer);
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");

		Movie m = new Movie();
		m.show();

		Movie m1 = new Movie("Buchi babu", "Mytri Movies");
		m1.show();

		Movie m2 = new Movie(m1, "Ram Charan", "Peddi", "Jahnavi");
		m2.show();

		Movie m3 = new Movie(m2, 350000000.00);
		m3.show();

		System.out.println("main method ended");

	}

	void show() {
		System.out.println("name of the movie:" + name);
		System.out.println("hero of the movie:" + hero);
		System.out.println("heroine of the movie:" + heroine);
		System.out.println("Producer of the movie:" + Producer);
		System.out.println("director of the movie:" + director);
		System.out.println("Budget:" + budget);
	}

}
