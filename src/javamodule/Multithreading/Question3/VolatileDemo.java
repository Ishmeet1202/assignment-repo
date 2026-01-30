package javamodule.Multithreading.Question3;

class SharedResource {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        System.out.println("Writer thread made the flag true.");
        this.flag = true;
    }

    public void printIfFlagTrue() {
        System.out.println("Reader is reading the flag.");
        while (!flag) {
            // do nothing
        }
        System.out.println("Flag is true.");
    }
}

public class VolatileDemo {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sr.setFlagTrue();
        });

        Thread readerThread = new Thread(() -> sr.printIfFlagTrue());


        writerThread.start();
        readerThread.start();
    }

}
