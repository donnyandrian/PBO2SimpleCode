package com.pbo2.p5;

import com.pbo2.p5.sync2.*;

public class Sync2Exercise {
    public static void main(String args[]) {
        TwoStrings ts = new TwoStrings();
        new PrintStringsThread("Hello ", "there.", ts);
        new PrintStringsThread("How are ", "you?", ts);
        new PrintStringsThread("Thank you ", "very much!", ts);
    }
}
