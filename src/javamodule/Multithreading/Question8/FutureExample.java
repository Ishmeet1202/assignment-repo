package javamodule.Multithreading.Question8;

import java.util.Random;
import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> (int) (Math.random() * 10) + 1;


        Future<Integer> future = executor.submit(task);

        System.out.println("Random Number = " + future.get());

        executor.shutdown();
    }
}
