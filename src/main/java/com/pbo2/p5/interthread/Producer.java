package com.pbo2.p5.interthread;

public class Producer implements Runnable {
    SharedData sd;

    public Producer(SharedData sd) {
        this.sd = sd;
        new Thread(this, "Producer").start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            sd.set((int) (Math.random() * 100));
        }
    }
}
