package com.task;

class myThread1 extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Thread1 : " + i);
		}

	}

}

class myThread2 extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Thread2 : " + i);
		}

	}

}

public class TwoThreadsUsingJoin {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started");

		myThread1 t1 = new myThread1();
		myThread2 t2 = new myThread2();

		t1.start();
		t1.join();
		t2.start();
		
		System.out.println("main method ended");


	}

}
