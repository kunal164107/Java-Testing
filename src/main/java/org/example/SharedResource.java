package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {

//    boolean itemAvailable = false;
//
//    public synchronized void addItem() {
//        itemAvailable = true;
//        System.out.println("item are added by " + Thread.currentThread().getName() + ", Invoke all consumer to consume this item");
//        notifyAll();
//    }
//
//    public void consumeItem() {
//        System.out.println("ConsumeItem invoked by " + Thread.currentThread().getName());
//        while(!itemAvailable) {
//            try {
//                System.out.println("item is not available " + Thread.currentThread().getName() + " is waiting now");
//                wait();
//            } catch (Exception e) {
//
//            }
//        }
//
//        synchronized (this) {
//        System.out.println("item consumed by thread " + Thread.currentThread().getName());
//        itemAvailable = false;
//        }
//    }
//
//    public synchronized void consumeItem1() {
//        System.out.println("ConsumeItem invoked by " + Thread.currentThread().getName());
//        while(!itemAvailable) {
//            try {
//                System.out.println("item is not available " + Thread.currentThread().getName() + " is waiting now");
//                wait();
//            } catch (Exception e) {
//
//            }
//        }
//
//        System.out.println("item consumed by thread " + Thread.currentThread().getName());
//        itemAvailable = false;
//    }


//    // Producer Consumer Problem with Fixed Buffer
//    private Queue<Integer> sharedBuffer;
//    private int bufferSize;
//
//    public SharedResource(int bufferSize) {
//        sharedBuffer = new LinkedList<>();
//        this.bufferSize = bufferSize;
//    }
//
//    public synchronized void addItem(int item) {
//        try {
//            while (sharedBuffer.size() == bufferSize) {
//                System.out.println("Queue is Full, Can't add more Item " + item);
//                wait();
//            }
//        } catch (Exception ex) {
//            // throws Exception
//        }
//        sharedBuffer.add(item);
//        System.out.println("Produced item " + item);
//        notifyAll();
//    }
//
//    public synchronized void consumeItem() {
//        try {
//            Thread.sleep(10000);
//            while (sharedBuffer.isEmpty()) {
//                System.out.println("Queue is Empty, Can't consume any Item");
//                wait();
//            }
//        } catch (Exception ex) {
//            // throws Exception
//        }
//        Integer itemConsumed = sharedBuffer.poll();
//        System.out.println("Consumed item " + itemConsumed);
//        notifyAll();
//    }



//    static int i = 1;
//    public void run() {
//        while(i < 11) {
//            if (i % 2 == 0 && Thread.currentThread().getName() == "even") {
//                synchronized (this) {
//                    try {
//                        System.out.println("Even Thread printed: " + i++);
//                        this.wait();
//                    } catch (Exception ex) {
//
//                    }
//                }
//            } else if (i % 2 != 0 && Thread.currentThread().getName() == "odd") {
//                synchronized (this) {
//                    try {
//                        System.out.println("Odd Thread printed: " + i++);
//                        this.notify();
//                        // WAP to print even and odd using 2 threads     } catch (Exception ex) {
//
//                    }
//                }
//            }
//
//        }
//    }

//    int counter;
//    SharedResource() {
//        counter = 0;
//    }
//
//    public void increment() {
//        counter++;
//    }
//
//    public int getCounter() {
//        return counter;
//    }

//    public synchronized void increment() {
//        counter++;
//    }

    AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

}
