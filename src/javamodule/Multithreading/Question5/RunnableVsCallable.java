package javamodule.Multithreading.Question5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        int result = 10 + 20;
        System.out.println("Runnable result = " + result);
    }
}

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() {
        return 10 + 20;
    }
}


public class RunnableVsCallable {

    public static void main(String[] args) throws Exception {

        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();
        runnableThread.join();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new MyCallable());

        Integer result = future.get(); // get returned value
        System.out.println("Callable result = " + result);

        executor.shutdown();
    }
}

