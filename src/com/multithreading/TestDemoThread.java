package com.multithreading;

public class TestDemoThread extends Thread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started");
		
		 TestDemoThread tt = new TestDemoThread();

	        tt.start();
	        tt.interrupt();//interrrupt thread

	        for (int i = 0; i < 10; i++) {
	            System.out.println("main : " + i);
	        }

	        System.out.println("main method ended");
	    }

	    @Override
	    public void run() {

	        System.out.println("run method started");
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}


	        for (int i = 0; i < 10; i++) {
	            System.out.println("run : " + i);
	        }

	        System.out.println("run method ended");
	   

	}

		
	}
	