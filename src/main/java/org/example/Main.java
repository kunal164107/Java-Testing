package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

//        MyFunctionalInterface obj = new MyFunctionalInterface() {
//            @Override
//            public void test() {
//                System.out.println("Test Lambda Expression 1");
//            }
//
////            @Override
////            public void test1() {
////                System.out.println("Test1 Lambda Expression");
////            }
//        };
//        obj.test();
////        obj.test1();
//
//        MyFunctionalInterface obj1 = () -> {
//            System.out.println("this is an example of Lambda Expression");
//        };
//        obj1.test();
//
////        MyFunctionalInterface lambdaExpression2 = (i) -> {
////            System.out.println("Lambda Expression 2 " + i);
////        };
////
////        lambdaExpression1.test();
////        lambdaExpression2.test1();
//
////        System.out.println("Hello world!");
//
//
//        Function<Integer, String> obj2 = (t) -> {
//            System.out.println("Multiline lambda expression");
//            return "out " + t;
//        };
//        System.out.println(obj2.apply(88));

//        List<Integer> myList = new ArrayList<>();
//        myList.addAll(Arrays.asList(20, 35, 37, 40, 61));
//
//        List<Integer> fileterList = myList.stream()
//                .filter(x -> x>20)
//                .peek(x -> System.out.println(x))
//                .sorted()
//                .peek(x -> {
//                    System.out.println("after sorted");
//                    System.out.println(x);
//                })
//                .collect(Collectors.toList());
//
//        System.out.println("original list " + myList);
//        System.out.println("filter list " + fileterList);

//        Integer[] myArray = {3, 4, 5, 6, 7};
//        Stream<Integer> myStream = Arrays.stream(myArray);
//        System.out.println(myStream);
//
//        Stream<Integer> intStream = Stream.of(3, 4, 6, 7);
//
//        List<Integer> collect = intStream.filter(x -> x > 3).collect(Collectors.toList());
////        List<Integer> collect1 = intStream.map(x -> x * 2).collect(Collectors.toList());
//
//        List<List<Integer>> myList = Arrays.asList(Arrays.asList(10, 2, 3), Arrays.asList(4, 50, 6), Arrays.asList(7, 8, 90));
//        System.out.println(myList);
//
//        List<Integer> flattened_list = myList.stream().flatMap(superList -> superList.stream()).collect(Collectors.toList());
//        System.out.println(flattened_list);
//
//
//        List<Integer> sortedList = flattened_list.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedList);
//
//        List<Integer> sortedListDesc = flattened_list.stream().sorted((val1, val2) -> val2 - val1).collect(Collectors.toList());
//        System.out.println(sortedListDesc);

//        List<String> myList = new ArrayList<>();
//        myList.addAll(Arrays.asList("20", "35", "37", "40", "61"));
//
//        double[] integers = myList.stream().mapToDouble(x -> Long.parseLong(x)).toArray();
//        System.out.println(integers);

//        String str = "123451";
//        Map<String, Long> stringIntegerMap = Arrays.stream(str.split("")).collect(
//                Collectors.groupingBy(Function.identity(), counting())
//        );
//        System.out.println(stringIntegerMap);

//          System.out.println("Before Thread Creation example: " + Thread.currentThread().getName());
//
//          // Approach 1 - This is shorthand of Approach 2
//          Thread th = new Thread(() -> {
//              System.out.println("code executed by thread: " + Thread.currentThread().getName());
//          });
//          th.start();
//
//          // Approach 2
//          MyThread runnableObj = new MyThread();
//          Thread th1 = new Thread(runnableObj);
//          th1.start();
//
//          // Approach 3
//          MyThread1 myThread1 = new MyThread1();
//          myThread1.start();
//
//          System.out.println("After Thread Creation example: " + Thread.currentThread().getName());

//          MonitorLockExample obj = new MonitorLockExample();
//          Thread t1 = new Thread(() -> obj.task1());
//          Thread t2 = new Thread(() -> obj.task2());
//          Thread t3 = new Thread(obj::task3);
//
//          t1.start();
//          t2.start();
//          t3.start();

//        SharedResource sharedResource = new SharedResource();
//        // Producer thread
//        Thread producerThread = new Thread(() -> {
//            System.out.println("inside producer thread " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(5000);
//            } catch (Exception e) {
//
//            }
//            sharedResource.addItem();
//        });
//
//        // Consumer Thread
//        Thread consumerThread = new Thread(() -> {
//            System.out.println("inside consumer thread " + Thread.currentThread().getName());
//            sharedResource.consumeItem();
//        });
//
//        producerThread.start();
//        consumerThread.start();


//        // Producer Consumer Problem with Fixed Buffer
//        SharedResource sharedResource = new SharedResource(3);
//        Thread producerThread = new Thread(() -> {
//            System.out.println("inside producer thread " + Thread.currentThread().getName());
//            for (int i = 1; i <= 6; i++) {
//                sharedResource.addItem(i);
//            }
//
//        });
//
//        Thread consumerThread = new Thread(() -> {
//            System.out.println("inside consumer thread " + Thread.currentThread().getName());
//            for (int i = 1; i <= 6; i++) {
//                sharedResource.consumeItem();
//            }
//        });
//
//        producerThread.start();
//        consumerThread.start();
//
//        producerThread.suspend();
//        producerThread.resume();

//        System.out.println("Main Thread Started " + Thread.currentThread().getName());
//
//        Thread th = new Thread(() -> {
//            System.out.println("New Thread Started");
//            try {
//                Thread.sleep(10000);
//            } catch (Exception ex) {
//
//            }
//        });
//
//        th.start();
//        try {
//            th.join();
//        } catch (Exception e) {
//
//        }
//
//        System.out.println("Main Thread end " + Thread.currentThread().getName());

//        // WAP to print even and odd using 2 threads
//        SharedResource sharedResource = new SharedResource();
//        Thread evenThread = new Thread(() -> {
//            sharedResource.run();
//        });
//        evenThread.setName("even");
//
//        Thread oddThread = new Thread(() -> {
//            sharedResource.run();
//        });
//        oddThread.setName("odd");
//
//        evenThread.start();
//        oddThread.start();


//        SharedResource sharedResource = new SharedResource();
//        for (int i = 0; i < 400; i++) {
//            sharedResource.increment();
//        }
//        System.out.println("counter value is " + sharedResource.getCounter());

//
//        SharedResource sharedResource = new SharedResource();
//        Thread th1 = new Thread(() -> {
//            for (int i = 0; i < 200000; i++) {
//                sharedResource.increment();
//            }
//        });
//
//        Thread th2 = new Thread(() -> {
//            for (int i = 0; i < 200000; i++) {
//                sharedResource.increment();
//            }
//        });
//
//        th1.start();
//        th2.start();
//
//        try {
//            th1.join();
//            th2.join();
//        } catch (Exception e) {
//
//        }
//
//        System.out.println("counter value while using multithreading " + sharedResource.getCounter());

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 1, TimeUnit.HOURS,
//                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
//
//        threadPoolExecutor.allowCoreThreadTimeOut(true);
//
//        for (int i = 0; i < 10; i++) {
//            threadPoolExecutor.submit(() -> {
//                try {
//                    Thread.sleep(5000);
//                    System.out.println("Thread name " + Thread.currentThread().getName());
//                } catch(Exception e) {
//
//                }
//            });
//        }
//
//        threadPoolExecutor.shutdown();


//        class CustomThreadFactory implements ThreadFactory {
//
//            @Override
//            public Thread newThread(Runnable r) {
//                Thread th = new Thread(r);
//                th.setDaemon(true);
//                th.setPriority(Thread.NORM_PRIORITY);
//                return th;
//            }
//        }
//
//        class CustomRejectionHandler implements RejectedExecutionHandler {
//
//            @Override
//            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
//                System.out.println("Thread Rejected " + r.toString());
//            }
//        }
//
//        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 4, 1, TimeUnit.HOURS, new LinkedBlockingQueue<>(5),
//                new CustomThreadFactory(), new CustomRejectionHandler());
//        threadPool.allowCoreThreadTimeOut(true);
//
//        for(int i = 0; i < 15; i++) {
//            threadPool.submit(() -> {
//                try {
//                    System.out.println("Thread name " + Thread.currentThread().getName());
//                    Thread.sleep(5000);
//                } catch (Exception e) {
//
//                }
//            });
//        }
//
//        threadPool.shutdown();

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 1, TimeUnit.SECONDS,
//                new LinkedBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
//
//        Future<?> futureObj = threadPoolExecutor.submit(() -> {
//            try {
//                System.out.println("Thread name " + Thread.currentThread().getName());
//                Thread.sleep(5000);
//            } catch (Exception ex) {
//
//            }
//        });
//
//        try {
//            futureObj.get(2, TimeUnit.SECONDS);
//        } catch (Exception ex) {
//
//        }
//        System.out.println("Task Completed " + futureObj.isDone());
//
//        threadPoolExecutor.shutdown();

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 1, TimeUnit.SECONDS,
//                new LinkedBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
//
//        // usecase 1
//        Future<?> task1 = threadPoolExecutor.submit(() -> {
//            System.out.println("Task 1 with Runnable without return " + Thread.currentThread().getName());
//        });
//
//        try {
//            Object outputFromTask1 = task1.get();
//            System.out.println("outputFromTask1 " + outputFromTask1);
//        } catch (Exception ex) {
//
//        }
//
//        // usecase 2
//        List<Integer> output = new ArrayList<>();
//        Future<List<Integer>> task2 = threadPoolExecutor.submit(() -> {
//            System.out.println("Task 2 with Runnable and Return " + Thread.currentThread().getName());
//            output.add(100);
//        }, output);
//
//        try {
//            List<Integer> outputFromTask2 = task2.get();
//            System.out.println("outputFromTask2 " + outputFromTask2.get(0));
//            System.out.println("output " + output.get(0));
//        } catch (Exception ex) {
//
//        }
//
//        // usecase 3
//        Future<List<Integer>> task3 = threadPoolExecutor.submit(() -> {
//            System.out.println("Task 3 with Callable " + Thread.currentThread().getName());
//            List<Integer> outputList = new ArrayList<>();
//            outputList.add(123);
//            return outputList;
//        });
//
//        try {
//            List<Integer> outputFromTask3 = task3.get();
//            System.out.println("outputFromTask3 " + outputFromTask3.get(0));
//        } catch (Exception ex) {
//
//        }
//
//        threadPoolExecutor.shutdown();

//        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 2, 1, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
//
//        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
//            return "Task1 executed using CF Interface by thread " + Thread.currentThread().getName() ;
//        });
//
//        CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(() -> {
//            return "Task2 executed using CF Interface by thread " + Thread.currentThread().getName() ;
//        }, poolExecutor);
//
//        try {
//            System.out.println(asyncTask1.get());
//            System.out.println(asyncTask2.get());
//        } catch (Exception e) {
//
//        }
//
//        poolExecutor.shutdown();

//        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
//            System.out.println("async task1 run by thread: " + Thread.currentThread().getName());
//            return "Kunal";
//        });
//
//        CompletableFuture<String> asyncTask2 = asyncTask1.thenApplyAsync((String val) -> {
//            System.out.println("async task2 run by thread: " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(5000);
//            } catch (Exception e) {
//
//            }
//            return val + " + Kumar";
//        });
//
//        CompletableFuture<String> asyncTask3 = asyncTask2.thenApplyAsync((String val) -> {
//            System.out.println("async task3 run by thread: " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(10000);
//            } catch (Exception e) {
//
//            }
//            return val + " + Kumar";
//        });
//
//        CompletableFuture<String> asyncTask4 = asyncTask3.thenApplyAsync((String val) -> {
//            System.out.println("async task4 run by thread: " + Thread.currentThread().getName());
//            return val + " + Kumar";
//        });
//
//        CompletableFuture<String> asyncTask5 = asyncTask4.thenApplyAsync((String val) -> {
//            System.out.println("async task5 run by thread: " + Thread.currentThread().getName());
//            return val + " + Kumar";
//        });
//
//        CompletableFuture<String> asyncTask6 = asyncTask1.thenApplyAsync((String val) -> {
//            System.out.println("async task6 run by thread: " + Thread.currentThread().getName());
//            return val + " + Kumar";
//        });
//
//
//        try {
//            System.out.println("Output of async task 1 " + asyncTask1.get());
//            System.out.println("Output of async task 2 " + asyncTask2.get());
//            System.out.println("Output of async task 3 " + asyncTask3.get());
//            System.out.println("Output of async task 4 " + asyncTask4.get());
//            System.out.println("Output of async task 5 " + asyncTask5.get());
//            System.out.println("Output of async task 6 " + asyncTask6.get());
//        } catch (Exception e) {
//
//        }

//        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
//            System.out.println("asyncTask1 Thread " + Thread.currentThread().getName());
//            return "hello";
//        }).thenComposeAsync((String val) -> {
//            return CompletableFuture.supplyAsync(() -> {
//                System.out.println("dependent task1 Thread " + Thread.currentThread().getName());
//                return val + " world ";
//            });
//        }).thenComposeAsync((String val) -> {
//            return CompletableFuture.supplyAsync(() -> {
//                System.out.println("dependent task2 Thread " + Thread.currentThread().getName());
//                return val + "all";
//            });
//        });
//
//        try {
//            System.out.println("output of async task " + asyncTask1.get());
//        } catch (Exception e) {
//
//        }
//
//        ExecutorService fixedThreadPoolExecutor = Executors.newFixedThreadPool(5);
//        fixedThreadPoolExecutor.submit(() -> {
//            System.out.println("Running via fixedThreadPoolExecutor " + Thread.currentThread().getName());
//            return "Running via fixedThreadPoolExecutor";
//        });
//
//        ExecutorService cachedThreadPoolExecutor = Executors.newCachedThreadPool();
//        cachedThreadPoolExecutor.submit(() -> {
//            System.out.println("Running via cachedThreadPoolExecutor " + Thread.currentThread().getName());
//            return "Running via cachedThreadPoolExecutor";
//        });
//
//        ExecutorService singleThreadPoolExecutor = Executors.newSingleThreadExecutor();
//        singleThreadPoolExecutor.submit(() -> {
//            System.out.println("Running via singleThreadPoolExecutor " + Thread.currentThread().getName());
//            return "Running via singleThreadPoolExecutor";
//        });


//        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
//        Future<Integer> futureObj = forkJoinPool.submit(new ComputeTask(0, 100));
//        try {
//            System.out.println(futureObj.get());
//        } catch (Exception e) {
//
//        }


//        class ComputeTask extends RecursiveTask<Integer> {
//
//            int start;
//            int end;
//
//            ComputeTask(int start, int end) {
//                this.start = start;
//                this.end = end;
//            }
//
//
//            @Override
//            protected Integer compute() {
//                if (end - start <= 4) {
//                    int totalSum = 0;
//                    for (int i = start; i <= end; i++) {
//                        totalSum += i;
//                    }
//                    return totalSum;
//                } else {
//                    int mid = (end + start) / 2;
//                    ComputeTask leftTask = new ComputeTask(start, mid);
//                    ComputeTask rightTask = new ComputeTask(mid+1, end);
//
//                    leftTask.fork();
//                    rightTask.fork();
//
//                    Integer leftResult = leftTask.join();
//                    Integer rightResult = rightTask.join();
//                    return leftResult + rightResult;
//                }
//            }
//        }
//
//        ExecutorService workStealThreadPoolExecutor = Executors.newWorkStealingPool();
//        Future<Integer> futureObj = workStealThreadPoolExecutor.submit(() -> {
//            System.out.println("Running via workStealThreadPoolExecutor");
//            return new ComputeTask(1, 100).compute();
//        });
//
//        try {
//            Integer result = futureObj.get();
//            System.out.println("Result: " + result);
//        } catch (Exception e) {
//
//        }


//        ExecutorService poolObj = Executors.newFixedThreadPool(5);
//        poolObj.submit(() -> {
//            try {
//                Thread.sleep(5000);
//                System.out.println("Submitting task in the pool before shutdown");
//            } catch (Exception e) {
//
//            }
//        });
//
//        poolObj.shutdownNow();
//        try {
//            boolean isExecutorTerminated = poolObj.awaitTermination(10, TimeUnit.SECONDS);
//            System.out.println("Main thread isExecutorTerminated " + isExecutorTerminated);
//        } catch (Exception e) {
//
//        }
//
//
//        poolObj.submit(() -> {
//            System.out.println("Submitting task in the pool after shutdown");
//        });


//        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(5);
//        poolObj.schedule(() -> {
//                System.out.println("hello");
//            }, 5, TimeUnit.SECONDS
//        );
//
//
//        ScheduledExecutorService poolObj1 = Executors.newScheduledThreadPool(5);
//        ScheduledFuture<String> scheduledFutureObj = poolObj1.schedule(() -> "hello world", 5, TimeUnit.SECONDS
//        );
//
//        try {
//            System.out.println(scheduledFutureObj.get());
//        } catch (Exception e) {
//
//        }


//        ScheduledExecutorService poolObj2 = Executors.newScheduledThreadPool(5);
//        ScheduledFuture<?> scheduledFutureObj1 = poolObj2.scheduleAtFixedRate(() -> {
//            System.out.println("task started by " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(5000);
//                System.out.println("task completed by " + Thread.currentThread().getName());
//            } catch (Exception e) {
//
//            }
//        }, 2, 3, TimeUnit.SECONDS);


//        ScheduledExecutorService poolObj3 = Executors.newScheduledThreadPool(5);
//        ScheduledFuture<?> scheduledFutureObj2 = poolObj3.scheduleWithFixedDelay(() -> {
//            System.out.println("task started by " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(5000);
//                System.out.println("task completed by " + Thread.currentThread().getName());
//            } catch (Exception e) {
//
//            }
//        }, 2, 3, TimeUnit.SECONDS);


//        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();
//
//        // main thread
//        threadLocalObj.set(Thread.currentThread().getName());
//
//        Thread thread1 = new Thread(() -> {
//            threadLocalObj.set(Thread.currentThread().getName());
//            System.out.println("Task1");
//        });
//
//        thread1.start();
//
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//
//        }
//
//        System.out.println("Main thread: " + threadLocalObj.get());

//        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();
//        ExecutorService poolObj = Executors.newFixedThreadPool(5);
//
//        poolObj.submit(() -> {
//            threadLocalObj.set(Thread.currentThread().getName());
//        });
//
//        for (int i = 0; i < 15; i++) {
//            poolObj.submit(() -> {
//                System.out.println(threadLocalObj.get());
//            });
//        }

//        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();
//        ExecutorService poolObj = Executors.newFixedThreadPool(5);
//
//        poolObj.submit(() -> {
//            threadLocalObj.set(Thread.currentThread().getName());
//            // my work completed, cleanup the threadlocal
//            threadLocalObj.remove();
//        });
//
//        for (int i = 0; i < 15; i++) {
//            poolObj.submit(() -> {
//                System.out.println(threadLocalObj.get());
//            });
//        }



//        // Virtual Thread concept comes in JDK 19 onwards
//        Thread platformThread = new Thread();
//        Thread virtualThread = Thread.ofVirtual().start(() -> System.out.println("Virtual Thread"));
//
//        ExecutorService platformThreadPoolObj = Executors.newFixedThreadPool(5);
//        ExecutorService virtualThreadPoolObj = Executors.newVirtualThreadPerTaskExecutor();
//        virtualThreadPoolObj.submit(() -> {
//            System.out.println("Example of Virtual Thread");
//        });


    }
}

