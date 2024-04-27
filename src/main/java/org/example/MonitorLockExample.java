package org.example;

public class MonitorLockExample {

    public synchronized void task1() {
        try {
            System.out.println("Inside Synchronized task1");
            Thread.sleep(10000);
        } catch (Exception e) {

        }
    }

    public void task2() {
        System.out.println("inside task2");
        synchronized (this) {
            System.out.println("inside synchronized, task2");
        }
    }

    public void task3() {
        System.out.println("inside task3");
    }
}
