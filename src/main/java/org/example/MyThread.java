package org.example;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("my Thread example: " + Thread.currentThread().getName());
    }




}
