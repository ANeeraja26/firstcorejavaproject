package com.multithreading;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run method started");
        System.out.println(Thread.currentThread());

        for (int i = 0; i < 10; i++) {
            System.out.println("run " + i);
        }

        System.out.println("run method ended");
    }

    public static void main(String[] args) {

        System.out.println("main method started");
        System.out.println(Thread.currentThread());

        MyThread m = new MyThread();
        m.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main " + i);
        }

        System.out.println("main method ended");
    }

	

}
