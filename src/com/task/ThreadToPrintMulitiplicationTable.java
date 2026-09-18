package com.task;

class TableThread extends Thread {

	int num;

	TableThread(int num) {
		this.num = num;
	}

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}

public class ThreadToPrintMulitiplicationTable {

	public static void main(String[] args) {
		TableThread t = new TableThread(3);
		t.start();

	}

}
