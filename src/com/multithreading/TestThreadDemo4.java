package com.multithreading;

import java.time.chrono.MinguoChronology;

public class TestThreadDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		 TestThreadDemo4 t4 = new TestThreadDemo4();

	        t4.start();
	        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
	        for (int i = 0; i < 10; i++) {
	            System.out.println("main " + i);
	        }

	        System.out.println("main method ended");
	    }

	    private void start() {
		
	}

		public void run() {

	        System.out.println("run method started");
	        
	        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
	        


	        for (int i = 0; i < 10; i++) {
	            System.out.println("run " + i);
	        }

	        System.out.println("run method ended");
			
		}
	}


