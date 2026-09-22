package com.task;

class SleepThread extends Thread {
	public void run() {

		try {
			System.out.println("Thread is sleeping");

			Thread.sleep(3000);
			System.out.println("Thread completed sleeping");

		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted");

		}

	}
	
	

}

public class SleepThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		SleepThread t = new SleepThread();
		t.start();
		Thread.sleep(2000);
		t.interrupt();
	}

}
