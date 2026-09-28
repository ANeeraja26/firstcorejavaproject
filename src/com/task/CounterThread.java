package com.task;

class counter {
	int count = 0;

	synchronized void increment() {
		count++;

	}
}

class MyThreads extends Thread {
	counter c;

	MyThreads(counter c) {
		this.c = c;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			c.increment();
		}
	}
}

public class CounterThread {

	public static void main(String[] args) throws InterruptedException {
		
		counter c=new counter();
		
		MyThreads t1=new MyThreads(c);
		
		MyThreads t2=new MyThreads(c);
		
		MyThreads t3=new MyThreads(c);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		
		
		
		
		
		
		
		
		
        System.out.println("Final Counter Value: " + c.count);

		
		
		
		

	}

}
