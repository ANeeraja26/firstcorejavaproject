package com.multithreading;

public class MyThread2 extends Thread {
	
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }


	public static void main(String[] args) throws InterruptedException {
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("Main thread ended");

	}

}
