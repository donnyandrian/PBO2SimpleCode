package com.pbo2.p5;

import com.pbo2.p5.interfaceRunnable.*;

public class InterfaceRunnableExercise {
    public static void main(String[] args) {
        new PrintNameThread("A");
        new PrintNameThread("B");
        new PrintNameThread("C");
        new PrintNameThread("D");
    }
}
