package javamodule.Multithreading.Question6;

import java.util.concurrent.locks.ReentrantLock;

class DeadlockHandled {

    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                if (lock1.tryLock()) {
                    System.out.println("Thread 1 acquired lock1");

                    Thread.sleep(100);

                    if (lock2.tryLock()) {
                        try {
                            System.out.println("Thread 1 acquired lock2");
                        } finally {
                            lock2.unlock();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (lock1.isHeldByCurrentThread()) {
                    lock1.unlock();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                if (lock2.tryLock()) {
                    System.out.println("Thread 2 acquired lock2");

                    Thread.sleep(100);

                    if (lock1.tryLock()) {
                        try {
                            System.out.println("Thread 2 acquired lock1");
                        } finally {
                            lock1.unlock();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (lock2.isHeldByCurrentThread()) {
                    lock2.unlock();
                }
            }
        });

        t1.start();
        t2.start();
    }
}


