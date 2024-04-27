package org.example;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread1 code executed by: " + Thread.currentThread().getName());
    }
}
