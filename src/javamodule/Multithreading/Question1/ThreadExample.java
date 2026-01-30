package javamodule.Multithreading.Question1;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " running " + i);
                Thread.sleep(1000); // pause thread
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started...");

        Thread t1 = new Thread(new MyRunnable(), "Thread-1");
        Thread t2 = new Thread(new MyRunnable(), "Thread-2");

        t1.start();
        t1.join();
        t2.start();

        System.out.println("Main thread terminated...");
    }
}

