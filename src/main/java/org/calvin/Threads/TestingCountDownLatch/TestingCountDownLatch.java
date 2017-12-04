package org.calvin.Threads.TestingCountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.System.exit;

class Processor implements Runnable {

    private java.util.concurrent.CountDownLatch latch;

    public Processor(java.util.concurrent.CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println("Started.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {}
        latch.countDown();
    }
}

public class TestingCountDownLatch {
    private static final int MAX_THREADS = 5;
    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(MAX_THREADS); // count down from 3 to 0

        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 Threads in pool

        for(int i=0; i < MAX_THREADS; i++) {
            executor.submit(new Processor(latch)); // ref to latch. each time call new Processes latch will count down by 1
        }

        try {
            latch.await();  // wait until latch counted down to 0
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed.");
        exit(0);
    }

}