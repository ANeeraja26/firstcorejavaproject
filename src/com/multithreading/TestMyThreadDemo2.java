package com.multithreading;

public class TestMyThreadDemo2 implements Runnable {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		TestMyThreadDemo2 m2=new TestMyThreadDemo2();
		Thread t=new Thread(m2);
		t.start();
		
		for(int i=0;i<10;i++){
			System.out.println("main : " + i);
			
		}
		
		System.out.println("main method ended");

	}

	@Override
	public void run() {
		
       System.out.println("run method  started");
		
		for(int i=0;i<10;i++){
			System.out.println("run : " + i);
			
		}
		
		System.out.println("run method ended");

	}

		
	}
	
	
	

