package com.task;

class OrderThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Order placed");
    }
}

class CookingThread extends Thread {

    @Override
    public void run() {
        System.out.println("Food is cooking");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Food is ready");
    }
}

class DeliveryThread extends Thread {

    @Override
    public void run() {
        System.out.println("Food is delivered");
    }
}

public class OrderThread {

    public static void main(String[] args) {

        OrderThread1 order = new OrderThread1();
        CookingThread cooking = new CookingThread();
        DeliveryThread delivery = new DeliveryThread();

        // Start Order
        order.start();

        try {
            order.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start Cooking after Order is completed
        cooking.start();

        try {
            cooking.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start Delivery after Cooking is completed
        delivery.start();
    }
}