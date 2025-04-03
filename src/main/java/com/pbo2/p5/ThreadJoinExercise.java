package com.pbo2.p5;

import com.pbo2.p5.threadJoin.*;

public class ThreadJoinExercise {
    public static void main(String args[]) {
        PrintNameThread pnt1 = new PrintNameThread("A");
        PrintNameThread pnt2 = new PrintNameThread("B");
        PrintNameThread pnt3 = new PrintNameThread("C");
        PrintNameThread pnt4 = new PrintNameThread("D");
        System.out.println("Running threads...");
        try {
            pnt1.thread.join();
            pnt2.thread.join();
            pnt3.thread.join();
            pnt4.thread.join();
        } catch (InterruptedException ie) {
        }
        System.out.println("Threads killed."); // dicetak terakhir
    }
}
