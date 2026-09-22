package com.task;

class MyThread extends Thread {
	
	public MyThread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

	@Override
	public void run() {
		System.out.println(
	            getName() + " Priority = " + getPriority());
	        
        for (int i = 1; i <= 5; i++) {

            System.out.println(getName() + " : " + i);
            try {

                if (getName().equals("DownloadThread")) {
                    Thread.sleep(1000);
                }

                if (getName().equals("CalculationThread")) {
                    Thread.sleep(500);
                }

                if (getName().equals("DisplayThread")) {
                    Thread.yield();
                }

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}



	


public class CreateThreadUsingThreadClass {

	public static void main(String[] args) {
		
        MyThread t1 = new MyThread(
                "DownloadThread",
                Thread.MAX_PRIORITY
            );
        MyThread t2 = new MyThread(
                "CalculationThread",
                Thread.NORM_PRIORITY
            );

            MyThread t3 = new MyThread(
                "DisplayThread",
                Thread.MIN_PRIORITY
            );

            System.out.println("Thread Details");

            System.out.println(t1.getName() + " : " + t1.getPriority());
            System.out.println(t2.getName() + " : " + t2.getPriority());
            System.out.println(t3.getName() + " : " + t3.getPriority());
            t1.start();
            t2.start();

            try {
            	t1.join();
                t2.join();

            } catch (InterruptedException e) {
                System.out.println(e);
            }

            t3.start();
            }
		
		

	}


