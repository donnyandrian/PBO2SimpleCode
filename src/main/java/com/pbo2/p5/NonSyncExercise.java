package com.pbo2.p5;

import com.pbo2.p5.nonSync.*;

public class NonSyncExercise {
    public static void main(String args[]) {
        new PrintStringsThread("Hello ", "there.");
        new PrintStringsThread("How are ", "you?");
        new PrintStringsThread("Thank you ", "very much!");
    }
}
