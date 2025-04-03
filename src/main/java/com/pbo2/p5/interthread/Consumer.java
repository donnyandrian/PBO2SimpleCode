package com.pbo2.p5.interthread;

public class Consumer implements Runnable {
    SharedData sd;

    public Consumer(SharedData sd) {
        this.sd = sd;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            sd.get();
        }
    }
}
