package com.multithreading;

class AudioThread extends Thread{
	
	
	
	@Override
	public void run()  {
		System.out.println("audio thread started");
		
		for(int i=0;i<10;i++){
			System.out.println("audio : " + i);
			
		}
		
		System.out.println("audio thread ended");

	}
	
}

class videoThread  extends Thread{
	
	@Override
	public void run()  {
		System.out.println("video thread started");
		
		for(int i=0;i<10;i++){
			System.out.println("video : " + i);
			
		}
		
		System.out.println("video thread ended");

	}

	
}

class TimerThread  extends Thread{
	
	@Override
	public void run()  {
		System.out.println("timer thread thread started");
		
		for(int i=0;i<10;i++){
			System.out.println("Timer Thread : " + i);
			
		}
		
		System.out.println("timer thread thread ended");

	}

	
}

public class TestThreadDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		AudioThread at=new AudioThread();
		videoThread vt=new videoThread();
		TimerThread tt=new TimerThread();
		
		at.start();
		vt.start();
		tt.start();
		
		
		System.out.println("main method ended");

		
	}

}
