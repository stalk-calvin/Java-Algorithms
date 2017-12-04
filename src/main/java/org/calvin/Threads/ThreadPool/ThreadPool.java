package org.calvin.Threads.ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Worker implements Runnable {

    private Random random = new Random();
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    public List<Integer> list1 = new ArrayList<>();
    public List<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        process();
    }

    public void process() {
        for (int i = 0; i < 1; i++) {
            stageOne();
            stageTwo();
        }
    }

    public void stageOne() {
        synchronized (lock1) {
            try {
                System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getStackTrace()[1].getMethodName() + ": Sleep 1 ms");
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void stageTwo() {
        synchronized (lock2) {
            try {
                System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getStackTrace()[1].getMethodName() + ": Sleep 1 s");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }
}

public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);//two threads, try setting by 1 to observe time
        System.out.println("Starting ...");
        long start = System.currentTimeMillis();
        Worker worker = new Worker();
        for (int i = 0; i < 20; i++) executor.submit(worker);
        executor.shutdown(); //prevents new tasks from being accepted by the ExecutorService
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
            // How long should I wait for termination If I do not know exactly when threads are done with the tasks ?
            // Source:http://stackoverflow.com/questions/1250643/how-to-wait-for-all-threads-to-finish-using-executorservice
            // For a perpetually running batch kind of thing u need to submit jobs and wait for them to
            // finish before jumping ahead.
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start));
        System.out.println("List1: " + worker.list1.size() + "; List2: " + worker.list2.size());
    }

}