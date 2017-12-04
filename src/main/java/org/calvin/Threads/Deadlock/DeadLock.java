package org.calvin.Threads.Deadlock;

public class DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] a) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }

    private static class Thread1 implements Runnable {
        public void run() {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + ": Holding lock1...");
                try {
                    Thread.sleep(1000); //wait until lock2 is acquired
                } catch (InterruptedException ignored) {}
                System.out.println(Thread.currentThread().getName() + ": Waiting for lock2...");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + ": Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class Thread2 implements Runnable {
        public void run() {
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + ": Holding lock2...");
                try {
                    Thread.sleep(1000); //wait until lock1 is acquired
                } catch (InterruptedException ignored) {}
                System.out.println(Thread.currentThread().getName() + ": Waiting for lock1...");
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + ": Holding lock 2 & 1...");
                }
            }
        }
    }
}