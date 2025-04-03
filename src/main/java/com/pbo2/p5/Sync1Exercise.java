package com.pbo2.p5;

import com.pbo2.p5.sync1.*;

public class Sync1Exercise {
    public static void main(String args[]) {
        new PrintStringsThread("Hello ", "there.");
        new PrintStringsThread("How are ", "you?");
        new PrintStringsThread("Thank you ", "very much!");
    }
}
