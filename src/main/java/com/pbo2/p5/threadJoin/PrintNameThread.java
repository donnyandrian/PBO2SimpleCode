package com.pbo2.p5.threadJoin;

public class PrintNameThread implements Runnable {
    public Thread thread;

    public PrintNameThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 100; i++) {
            System.out.print(name);
        }
    }
}
