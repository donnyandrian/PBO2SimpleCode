package com.pbo2.p5.interthread;

public class SharedData {
    int data;
    boolean valueSet = false;

    synchronized void set(int value) {
        if (valueSet) { // baru saja membangkitkan sebuah nilai
            try {
                wait();
            } catch (InterruptedException ie) {
            }
        }
        System.out.println("Generate " + value);
        data = value;
        valueSet = true;
        notify();
    }

    synchronized int get() {
        if (!valueSet) { // produsen belum men-set sebuah nilai
            try {
                wait();
            } catch (InterruptedException ie) {
            }
        }
        System.out.println("Get " + data);
        valueSet = false;
        notify();
        return data;
    }
}
