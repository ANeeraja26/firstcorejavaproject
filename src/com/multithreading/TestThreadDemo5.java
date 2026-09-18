package com.multithreading;

class JThread extends Thread{
	@Override
	public void run() {
		
		int sum=0;
		for(int i=0;i<10;i++) {
			System.out.println("j1 Thread : " + i);
			sum=sum+i;
			
			
		}
		System.out.println("j1 total is : " + sum);
	}
}

public class TestThreadDemo5{

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		JThread jt=new JThread();
		jt.start();
		
		System.out.println("main method ended");

	}

}
