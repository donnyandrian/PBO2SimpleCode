package com.pbo2.p5;

import com.pbo2.p5.interthread.*;

public class InterthreadExercise {
    public static void main(String args[]) throws Exception {
        SharedData sd = new SharedData();
        new Producer(sd);
        new Consumer(sd);
    }
}
