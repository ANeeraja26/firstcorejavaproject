package com.exceptionhandling;

public class TestDemo9 {
	

	    static int hello() {
	        try {
	            return 20;
	        } 
	        catch (Exception e) {
	            return 30;
	        } 
	        finally {
	            return 50;
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println("main method started");

	        System.out.println(hello());
	    }
		}


