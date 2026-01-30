package javamodule.Multithreading.Question9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownNowExample {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " started");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " completed");
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }
        };

        executor.submit(task);
        executor.submit(task);

        executor.shutdownNow();
        System.out.println("shutdownNow() called");
    }
}
