package com.pbo2.p5;

import com.pbo2.p5.thread.*;

public class ThreadExercise {
    public static void main(String[] args) {
        CountDownGUI cdg = new CountDownGUI("Count down GUI");
        cdg.startCount();
    }
}
