package javamodule.Multithreading.Question7;

import java.util.concurrent.*;

public class ExecutorDemo {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService single = Executors.newSingleThreadExecutor();
        ExecutorService fixed = Executors.newFixedThreadPool(2);
        ExecutorService cached = Executors.newCachedThreadPool();

        Runnable task = () -> System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 5; i++) {
            single.submit(task);
            fixed.submit(task);
            cached.submit(task);
        }

        single.shutdown();
        fixed.shutdown();
        cached.shutdown();

        single.awaitTermination(5, TimeUnit.SECONDS);
        fixed.awaitTermination(5, TimeUnit.SECONDS);
        cached.awaitTermination(5, TimeUnit.SECONDS);
    }
}

